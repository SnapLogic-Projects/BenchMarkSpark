package com.snaplogic.sparkImp;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class SparkSQL {
    public static void main(String[] args) {
        SparkSession spark = SparkSession
                .builder()
                .appName("SnapLogic Spark SQL example")
                .master("local")
                .getOrCreate();
        Dataset<Row> df = spark.read()
                .format("csv")
                .option("delimiter",",")
                .option("quote","")
                .option("header", "true")
                .load(args[0]);
        df.createOrReplaceTempView("table");
        Dataset<Row> sqlDF = spark.sql("SELECT * FROM table WHERE ProviderState='AL' ORDER BY ProviderCity");
        sqlDF.coalesce(1).write()
                .format("csv")
                .option("header","true")
                .save(args[1]);
    }
}
