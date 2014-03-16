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
public class Tables extends org.jooq.impl.TableImpl<maxicmd.jooq.information_schema.tables.records.TablesRecord> {

	private static final long serialVersionUID = -830953839;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.TABLES</code>
	 */
	public static final maxicmd.jooq.information_schema.tables.Tables TABLES = new maxicmd.jooq.information_schema.tables.Tables();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<maxicmd.jooq.information_schema.tables.records.TablesRecord> getRecordType() {
		return maxicmd.jooq.information_schema.tables.records.TablesRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_CATALOG</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_TYPE</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_TYPE = createField("TABLE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.STORAGE_TYPE</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.TablesRecord, java.lang.String> STORAGE_TYPE = createField("STORAGE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.SQL</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.TablesRecord, java.lang.String> SQL = createField("SQL", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.REMARKS</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.TablesRecord, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.LAST_MODIFICATION</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.TablesRecord, java.lang.Long> LAST_MODIFICATION = createField("LAST_MODIFICATION", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.ID</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.TablesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.TYPE_NAME</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.TablesRecord, java.lang.String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_CLASS</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.TablesRecord, java.lang.String> TABLE_CLASS = createField("TABLE_CLASS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TABLES.ROW_COUNT_ESTIMATE</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.TablesRecord, java.lang.Long> ROW_COUNT_ESTIMATE = createField("ROW_COUNT_ESTIMATE", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.TABLES</code> table reference
	 */
	public Tables() {
		this("TABLES", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.TABLES</code> table reference
	 */
	public Tables(java.lang.String alias) {
		this(alias, maxicmd.jooq.information_schema.tables.Tables.TABLES);
	}

	private Tables(java.lang.String alias, org.jooq.Table<maxicmd.jooq.information_schema.tables.records.TablesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Tables(java.lang.String alias, org.jooq.Table<maxicmd.jooq.information_schema.tables.records.TablesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, maxicmd.jooq.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public maxicmd.jooq.information_schema.tables.Tables as(java.lang.String alias) {
		return new maxicmd.jooq.information_schema.tables.Tables(alias, this);
	}

	/**
	 * Rename this table
	 */
	public maxicmd.jooq.information_schema.tables.Tables rename(java.lang.String name) {
		return new maxicmd.jooq.information_schema.tables.Tables(name, null);
	}
}
