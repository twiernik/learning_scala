/**
 * This class is generated by jOOQ
 */
package maxicmd.jooq.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnPrivileges extends org.jooq.impl.TableImpl<maxicmd.jooq.information_schema.tables.records.ColumnPrivilegesRecord> {

	private static final long serialVersionUID = 1877152883;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES</code>
	 */
	public static final maxicmd.jooq.information_schema.tables.ColumnPrivileges COLUMN_PRIVILEGES = new maxicmd.jooq.information_schema.tables.ColumnPrivileges();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<maxicmd.jooq.information_schema.tables.records.ColumnPrivilegesRecord> getRecordType() {
		return maxicmd.jooq.information_schema.tables.records.ColumnPrivilegesRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.GRANTOR</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnPrivilegesRecord, java.lang.String> GRANTOR = createField("GRANTOR", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.GRANTEE</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnPrivilegesRecord, java.lang.String> GRANTEE = createField("GRANTEE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_CATALOG</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnPrivilegesRecord, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnPrivilegesRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnPrivilegesRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.COLUMN_NAME</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnPrivilegesRecord, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.PRIVILEGE_TYPE</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnPrivilegesRecord, java.lang.String> PRIVILEGE_TYPE = createField("PRIVILEGE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES.IS_GRANTABLE</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnPrivilegesRecord, java.lang.String> IS_GRANTABLE = createField("IS_GRANTABLE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES</code> table reference
	 */
	public ColumnPrivileges() {
		this("COLUMN_PRIVILEGES", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.COLUMN_PRIVILEGES</code> table reference
	 */
	public ColumnPrivileges(java.lang.String alias) {
		this(alias, maxicmd.jooq.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES);
	}

	private ColumnPrivileges(java.lang.String alias, org.jooq.Table<maxicmd.jooq.information_schema.tables.records.ColumnPrivilegesRecord> aliased) {
		this(alias, aliased, null);
	}

	private ColumnPrivileges(java.lang.String alias, org.jooq.Table<maxicmd.jooq.information_schema.tables.records.ColumnPrivilegesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, maxicmd.jooq.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public maxicmd.jooq.information_schema.tables.ColumnPrivileges as(java.lang.String alias) {
		return new maxicmd.jooq.information_schema.tables.ColumnPrivileges(alias, this);
	}

	/**
	 * Rename this table
	 */
	public maxicmd.jooq.information_schema.tables.ColumnPrivileges rename(java.lang.String name) {
		return new maxicmd.jooq.information_schema.tables.ColumnPrivileges(name, null);
	}
}
