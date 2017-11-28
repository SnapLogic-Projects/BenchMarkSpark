package com.snaplogic.sparkImp;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkRDD {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("Spark RDD").setMaster("local");
        JavaSparkContext sc = new JavaSparkContext(conf);
        JavaRDD<String> data = sc.textFile(args[0]);
        JavaRDD<RetailInfo> retailData = data.map(s->{
            try{
                RetailInfo info = new RetailInfo();
                info.set(s.split(","));
                return info;
            }
            catch (Exception e){
                return new RetailInfo();
            }
        });
        JavaRDD<RetailInfo> obj = retailData.
                filter( r -> r.getProviderState().equals("AL")).
                sortBy( r1 -> r1.getProviderCity(),true,1);

        obj.saveAsTextFile(args[1]);
        while (true){}

    }
}
