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
public class Event extends org.jooq.impl.TableImpl<maxicmd.jooq.tables.records.EventRecord> {

	private static final long serialVersionUID = 882539094;

	/**
	 * The singleton instance of <code>public.event</code>
	 */
	public static final maxicmd.jooq.tables.Event EVENT = new maxicmd.jooq.tables.Event();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<maxicmd.jooq.tables.records.EventRecord> getRecordType() {
		return maxicmd.jooq.tables.records.EventRecord.class;
	}

	/**
	 * The column <code>public.event.id</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.tables.records.EventRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.event.name</code>.
	 */
	public final org.jooq.TableField<maxicmd.jooq.tables.records.EventRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).defaulted(true), this, "");

	/**
	 * Create a <code>public.event</code> table reference
	 */
	public Event() {
		this("event", null);
	}

	/**
	 * Create an aliased <code>public.event</code> table reference
	 */
	public Event(java.lang.String alias) {
		this(alias, maxicmd.jooq.tables.Event.EVENT);
	}

	private Event(java.lang.String alias, org.jooq.Table<maxicmd.jooq.tables.records.EventRecord> aliased) {
		this(alias, aliased, null);
	}

	private Event(java.lang.String alias, org.jooq.Table<maxicmd.jooq.tables.records.EventRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, maxicmd.jooq.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<maxicmd.jooq.tables.records.EventRecord> getPrimaryKey() {
		return maxicmd.jooq.Keys.EVENT_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<maxicmd.jooq.tables.records.EventRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<maxicmd.jooq.tables.records.EventRecord>>asList(maxicmd.jooq.Keys.EVENT_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public maxicmd.jooq.tables.Event as(java.lang.String alias) {
		return new maxicmd.jooq.tables.Event(alias, this);
	}

	/**
	 * Rename this table
	 */
	public maxicmd.jooq.tables.Event rename(java.lang.String name) {
		return new maxicmd.jooq.tables.Event(name, null);
	}
}
