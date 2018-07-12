
package fr.epita.iam.services.conf;

/**
 * <h3>ConfKey</h3>
 * <p>This class is made for the configuration keys</p>
 *
 * <h3>Usage</h3>
 * <p>This class should be used as follows:
 *   <pre><code>${type_name} instance = new ${type_name}();</code></pre>
 * </p>
 *
 * @date 6/18
 * @author Maria Anastas
 *
 * ${tags}
 */
public enum ConfKey {
	/**
	 * this is the key to choose the backend mode
	 */
	BACKEND_MODE("backend.mode"),
	/**
	 * this is the key to choose the fall back backend mode
	 */

	FALLBACK_BACKEND_MODE("backend.mode"),

	/**
	 *
	 */
	DB_URL("db.url"),

	/**
	 *
	 */
	DB_USER("db.user"),

	/**
	 *
	 */
	DB_PASSWORD("db.pwd"),

	/**
	 *
	 */
	DB_BACKEND("db"),

	/**
	 *
	 */
	IDENTITY_SEARCH_QUERY(
			"identity.search"),
	/**
	 *
	 */
	IDENTITY_INSERT_QUERY("identity.insert"),

	XML_BACKEND_FILE("xml.file"),

	;

	private String key;

	/**
	 *
	 */
	private ConfKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

}
