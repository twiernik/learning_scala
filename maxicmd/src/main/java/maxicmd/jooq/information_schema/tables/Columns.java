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
public class Columns extends org.jooq.impl.TableImpl<maxicmd.jooq.information_schema.tables.records.ColumnsRecord> {

	private static final long serialVersionUID = -1798435344;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.COLUMNS</code>
	 */
	public static final maxicmd.jooq.information_schema.tables.Columns COLUMNS = new maxicmd.jooq.information_schema.tables.Columns();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<maxicmd.jooq.information_schema.tables.records.ColumnsRecord> getRecordType() {
		return maxicmd.jooq.information_schema.tables.records.ColumnsRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.TABLE_CATALOG</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.TABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_NAME</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.ORDINAL_POSITION</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.Integer> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_DEFAULT</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.String> COLUMN_DEFAULT = createField("COLUMN_DEFAULT", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.IS_NULLABLE</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.String> IS_NULLABLE = createField("IS_NULLABLE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.DATA_TYPE</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.Integer> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.Integer> CHARACTER_MAXIMUM_LENGTH = createField("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.Integer> CHARACTER_OCTET_LENGTH = createField("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_PRECISION</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.Integer> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_PRECISION_RADIX</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.Integer> NUMERIC_PRECISION_RADIX = createField("NUMERIC_PRECISION_RADIX", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_SCALE</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.Integer> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_SET_NAME</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.COLLATION_NAME</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.TYPE_NAME</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.NULLABLE</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.Integer> NULLABLE = createField("NULLABLE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.IS_COMPUTED</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.Boolean> IS_COMPUTED = createField("IS_COMPUTED", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.SELECTIVITY</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.Integer> SELECTIVITY = createField("SELECTIVITY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.CHECK_CONSTRAINT</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.String> CHECK_CONSTRAINT = createField("CHECK_CONSTRAINT", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.SEQUENCE_NAME</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.String> SEQUENCE_NAME = createField("SEQUENCE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.REMARKS</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.COLUMNS.SOURCE_DATA_TYPE</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.information_schema.tables.records.ColumnsRecord, java.lang.Short> SOURCE_DATA_TYPE = createField("SOURCE_DATA_TYPE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.COLUMNS</code> table reference
	 */
	public Columns() {
		this("COLUMNS", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.COLUMNS</code> table reference
	 */
	public Columns(java.lang.String alias) {
		this(alias, maxicmd.jooq.information_schema.tables.Columns.COLUMNS);
	}

	private Columns(java.lang.String alias, org.jooq.Table<maxicmd.jooq.information_schema.tables.records.ColumnsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Columns(java.lang.String alias, org.jooq.Table<maxicmd.jooq.information_schema.tables.records.ColumnsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, maxicmd.jooq.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public maxicmd.jooq.information_schema.tables.Columns as(java.lang.String alias) {
		return new maxicmd.jooq.information_schema.tables.Columns(alias, this);
	}

	/**
	 * Rename this table
	 */
	public maxicmd.jooq.information_schema.tables.Columns rename(java.lang.String name) {
		return new maxicmd.jooq.information_schema.tables.Columns(name, null);
	}
}
