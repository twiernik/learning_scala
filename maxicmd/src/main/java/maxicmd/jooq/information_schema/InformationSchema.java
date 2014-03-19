/**
 * This class is generated by jOOQ
 */
package maxicmd.jooq.information_schema;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchema extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1252449934;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA</code>
	 */
	public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

	/**
	 * No further instances allowed
	 */
	private InformationSchema() {
		super("INFORMATION_SCHEMA");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			maxicmd.jooq.information_schema.tables.QueryStatistics.QUERY_STATISTICS,
			maxicmd.jooq.information_schema.tables.SessionState.SESSION_STATE,
			maxicmd.jooq.information_schema.tables.Locks.LOCKS,
			maxicmd.jooq.information_schema.tables.Sessions.SESSIONS,
			maxicmd.jooq.information_schema.tables.Triggers.TRIGGERS,
			maxicmd.jooq.information_schema.tables.Domains.DOMAINS,
			maxicmd.jooq.information_schema.tables.Constants.CONSTANTS,
			maxicmd.jooq.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS,
			maxicmd.jooq.information_schema.tables.Constraints.CONSTRAINTS,
			maxicmd.jooq.information_schema.tables.CrossReferences.CROSS_REFERENCES,
			maxicmd.jooq.information_schema.tables.InDoubt.IN_DOUBT,
			maxicmd.jooq.information_schema.tables.Views.VIEWS,
			maxicmd.jooq.information_schema.tables.Collations.COLLATIONS,
			maxicmd.jooq.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES,
			maxicmd.jooq.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES,
			maxicmd.jooq.information_schema.tables.Schemata.SCHEMATA,
			maxicmd.jooq.information_schema.tables.FunctionAliases.FUNCTION_ALIASES,
			maxicmd.jooq.information_schema.tables.Rights.RIGHTS,
			maxicmd.jooq.information_schema.tables.Roles.ROLES,
			maxicmd.jooq.information_schema.tables.Users.USERS,
			maxicmd.jooq.information_schema.tables.Sequences.SEQUENCES,
			maxicmd.jooq.information_schema.tables.Help.HELP,
			maxicmd.jooq.information_schema.tables.Settings.SETTINGS,
			maxicmd.jooq.information_schema.tables.Catalogs.CATALOGS,
			maxicmd.jooq.information_schema.tables.TypeInfo.TYPE_INFO,
			maxicmd.jooq.information_schema.tables.TableTypes.TABLE_TYPES,
			maxicmd.jooq.information_schema.tables.Indexes.INDEXES,
			maxicmd.jooq.information_schema.tables.Columns.COLUMNS,
			maxicmd.jooq.information_schema.tables.Tables.TABLES);
	}
}