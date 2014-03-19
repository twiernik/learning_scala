/**
 * This class is generated by jOOQ
 */
package maxicmd.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Diet extends org.jooq.impl.TableImpl<maxicmd.jooq.tables.records.DietRecord> {

	private static final long serialVersionUID = 1239313036;

	/**
	 * The singleton instance of <code>public.diet</code>
	 */
	public static final maxicmd.jooq.tables.Diet DIET = new maxicmd.jooq.tables.Diet();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<maxicmd.jooq.tables.records.DietRecord> getRecordType() {
		return maxicmd.jooq.tables.records.DietRecord.class;
	}

	/**
	 * The column <code>public.diet.id</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.tables.records.DietRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.diet.name</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.tables.records.DietRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaulted(true), this, "");

	/**
	 * Create a <code>public.diet</code> table reference
	 */
	public Diet() {
		this("diet", null);
	}

	/**
	 * Create an aliased <code>public.diet</code> table reference
	 */
	public Diet(java.lang.String alias) {
		this(alias, maxicmd.jooq.tables.Diet.DIET);
	}

	private Diet(java.lang.String alias, org.jooq.Table<maxicmd.jooq.tables.records.DietRecord> aliased) {
		this(alias, aliased, null);
	}

	private Diet(java.lang.String alias, org.jooq.Table<maxicmd.jooq.tables.records.DietRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, maxicmd.jooq.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<maxicmd.jooq.tables.records.DietRecord> getPrimaryKey() {
		return maxicmd.jooq.Keys.DIED_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<maxicmd.jooq.tables.records.DietRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<maxicmd.jooq.tables.records.DietRecord>>asList(maxicmd.jooq.Keys.DIED_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public maxicmd.jooq.tables.Diet as(java.lang.String alias) {
		return new maxicmd.jooq.tables.Diet(alias, this);
	}

	/**
	 * Rename this table
	 */
	public maxicmd.jooq.tables.Diet rename(java.lang.String name) {
		return new maxicmd.jooq.tables.Diet(name, null);
	}
}