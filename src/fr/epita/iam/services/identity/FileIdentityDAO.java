package fr.epita.iam.services.identity;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

import fr.epita.iam.datamodel.Identity;

/**
 * <h3>FileIdentityDAO</h3>
 * <p>
 * This class allows to ...
 * </p>

 *
 * @date 6/18
 * @author Maria Anastas

 */

public class FileIdentityDAO {

	private final PrintWriter writer;
	private final Scanner scanner;

	private final BiPredicate<Identity, Identity> searchFilter;
	//
	// @Override
	// public boolean test(Identity currentIdentity, Identity criteria) {
	// return matchString(currentIdentity.getEmail(), criteria.getEmail())
	// || matchString(currentIdentity.getDisplayName(), criteria.getDisplayName());
	// }
	//
	//
	// };


	public FileIdentityDAO(BiPredicate<Identity, Identity> searchFilter) throws FileNotFoundException, IOException {
		final File file = new File("C:/tmp/2018s1/identities.txt");
		writer = initializePrintWriter(file);
		scanner = initializeScanner(file);
		this.searchFilter = searchFilter;
	}

	public void create(Identity identity) {
		writer.println("---");
		writer.println(identity.getDisplayName());
		writer.println(identity.getEmail());
		writer.println(identity.getUid());
		writer.println("---");
		writer.flush();
	}

	public List<Identity> search(Identity criteria) {
		final ArrayList<Identity> list = new ArrayList<>();
		while (scanner.hasNext()) {

			scanner.nextLine();
			final String displayName = scanner.nextLine();
			final String email = scanner.nextLine();
			final String uid = scanner.nextLine();
			scanner.nextLine();
			final Identity currentIdentity = new Identity(displayName, uid, email);

			if (searchFilter.test(currentIdentity, criteria)) {
				list.add(currentIdentity);
			}

		}

		return list;
	}

	/**
	 * <h3>Description</h3>
	 * <p>
	 * This methods allows to ...
	 * </p>
	 *
	 * <h3>Usage</h3>
	 * <p>
	 * It should be used as follows :
	 *
	 * <pre>
	 * <code> ${enclosing_type} sample;
	 *
	 * //...
	 *
	 * sample.${enclosing_method}();
	 *</code>
	 * </pre>
	 * </p>
	 *
	 * @since $${version}
	 * @see Voir aussi $${link}
	 * @author ${user}
	 *
	 *         ${tags}
	 */
	private boolean matchString(String current, String expected) {
		return current.contains(expected);
	}

	public void update(Identity identity) {

	}

	public void delete(Identity identity) {

	}

	private static PrintWriter initializePrintWriter(final File file) throws IOException, FileNotFoundException {
		if (!file.exists()) {
			file.getParentFile().mkdirs();
			file.createNewFile();
		}
		final FileOutputStream fos = new FileOutputStream(file, true);
		final PrintWriter writer = new PrintWriter(fos);
		return writer;
	}

	private static Scanner initializeScanner(final File file) throws IOException, FileNotFoundException {
		if (!file.exists()) {
			file.getParentFile().mkdirs();
			file.createNewFile();
		}

		return new Scanner(file);
	}

	public void releaseResources() {
		writer.close();
	}
}

