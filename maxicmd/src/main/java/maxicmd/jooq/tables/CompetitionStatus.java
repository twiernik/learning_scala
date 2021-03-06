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
public class CompetitionStatus extends org.jooq.impl.TableImpl<maxicmd.jooq.tables.records.CompetitionStatusRecord> {

	private static final long serialVersionUID = 830401996;

	/**
	 * The singleton instance of <code>public.competition_status</code>
	 */
	public static final maxicmd.jooq.tables.CompetitionStatus COMPETITION_STATUS = new maxicmd.jooq.tables.CompetitionStatus();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<maxicmd.jooq.tables.records.CompetitionStatusRecord> getRecordType() {
		return maxicmd.jooq.tables.records.CompetitionStatusRecord.class;
	}

	/**
	 * The column <code>public.competition_status.id</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.tables.records.CompetitionStatusRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.competition_status.name</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.tables.records.CompetitionStatusRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaulted(true), this, "");

	/**
	 * Create a <code>public.competition_status</code> table reference
	 */
	public CompetitionStatus() {
		this("competition_status", null);
	}

	/**
	 * Create an aliased <code>public.competition_status</code> table reference
	 */
	public CompetitionStatus(java.lang.String alias) {
		this(alias, maxicmd.jooq.tables.CompetitionStatus.COMPETITION_STATUS);
	}

	private CompetitionStatus(java.lang.String alias, org.jooq.Table<maxicmd.jooq.tables.records.CompetitionStatusRecord> aliased) {
		this(alias, aliased, null);
	}

	private CompetitionStatus(java.lang.String alias, org.jooq.Table<maxicmd.jooq.tables.records.CompetitionStatusRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, maxicmd.jooq.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<maxicmd.jooq.tables.records.CompetitionStatusRecord> getPrimaryKey() {
		return maxicmd.jooq.Keys.COMPETITION_STATUS_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<maxicmd.jooq.tables.records.CompetitionStatusRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<maxicmd.jooq.tables.records.CompetitionStatusRecord>>asList(maxicmd.jooq.Keys.COMPETITION_STATUS_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public maxicmd.jooq.tables.CompetitionStatus as(java.lang.String alias) {
		return new maxicmd.jooq.tables.CompetitionStatus(alias, this);
	}

	/**
	 * Rename this table
	 */
	public maxicmd.jooq.tables.CompetitionStatus rename(java.lang.String name) {
		return new maxicmd.jooq.tables.CompetitionStatus(name, null);
	}
}
