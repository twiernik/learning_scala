package maxicmd

import java.sql.DriverManager
import org.jooq.{SQLDialect, DSLContext}
import org.jooq.impl.DSL

/**
 * Created by Kobek on 17.03.14.
 */
object ConnHelper {
  new org.h2.Driver();

  def getContext(): DSLContext = {
    val userName = "postgres";
    val password = "root";
    val url = "jdbc:postgresql://localhost/maxi";

    return DSL.using(DriverManager.getConnection(url, userName, password), SQLDialect.POSTGRES);
  }
}
