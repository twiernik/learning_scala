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
public class CompetitionType extends org.jooq.impl.TableImpl<maxicmd.jooq.tables.records.CompetitionTypeRecord> {

	private static final long serialVersionUID = -189110308;

	/**
	 * The singleton instance of <code>public.competition_type</code>
	 */
	public static final maxicmd.jooq.tables.CompetitionType COMPETITION_TYPE = new maxicmd.jooq.tables.CompetitionType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<maxicmd.jooq.tables.records.CompetitionTypeRecord> getRecordType() {
		return maxicmd.jooq.tables.records.CompetitionTypeRecord.class;
	}

	/**
	 * The column <code>public.competition_type.id</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.tables.records.CompetitionTypeRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.competition_type.name</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.tables.records.CompetitionTypeRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaulted(true), this, "");

	/**
	 * Create a <code>public.competition_type</code> table reference
	 */
	public CompetitionType() {
		this("competition_type", null);
	}

	/**
	 * Create an aliased <code>public.competition_type</code> table reference
	 */
	public CompetitionType(java.lang.String alias) {
		this(alias, maxicmd.jooq.tables.CompetitionType.COMPETITION_TYPE);
	}

	private CompetitionType(java.lang.String alias, org.jooq.Table<maxicmd.jooq.tables.records.CompetitionTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private CompetitionType(java.lang.String alias, org.jooq.Table<maxicmd.jooq.tables.records.CompetitionTypeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, maxicmd.jooq.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<maxicmd.jooq.tables.records.CompetitionTypeRecord> getPrimaryKey() {
		return maxicmd.jooq.Keys.COMPETITION_TYPE_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<maxicmd.jooq.tables.records.CompetitionTypeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<maxicmd.jooq.tables.records.CompetitionTypeRecord>>asList(maxicmd.jooq.Keys.COMPETITION_TYPE_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public maxicmd.jooq.tables.CompetitionType as(java.lang.String alias) {
		return new maxicmd.jooq.tables.CompetitionType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public maxicmd.jooq.tables.CompetitionType rename(java.lang.String name) {
		return new maxicmd.jooq.tables.CompetitionType(name, null);
	}
}
