import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement


def dbPath = "C:/Users/dell/Katalon Studio/Project/Data Files/DatabaseTest.db"

Class.forName("org.sqlite.JDBC")
println "✅ SQLite JDBC driver loaded"

Connection conn = DriverManager.getConnection("jdbc:sqlite:${dbPath}")
println "✅ Connected to Database"

Statement stmt = conn.createStatement()

println "\n📌 Listing all tables in the database:"
ResultSet tables = stmt.executeQuery("SELECT name FROM sqlite_master WHERE type='table'")
def tableList = []
while(tables.next()) {
    def tableName = tables.getString("name")
    tableList << tableName
    println "Table found: $tableName"
}
tables.close()

// 6️⃣ Loop through all tables and print their data
tableList.each { tableName ->
    println "\n📌 Data from table: $tableName"
    ResultSet rs = stmt.executeQuery("SELECT * FROM $tableName")
    
    // Get column count dynamically
    def meta = rs.getMetaData()
    def colCount = meta.getColumnCount()
    
    // Print each row
    while(rs.next()) {
        def rowData = []
        for(int i=1; i<=colCount; i++) {
            rowData << "${meta.getColumnName(i)}=${rs.getString(i)}"
        }
        println rowData.join(", ")
    }
    rs.close()
}

// 7️⃣ Close the statement and connection
stmt.close()
conn.close()
println "\n✅ Database connection closed"
