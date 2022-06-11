/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Home;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author ijaa76
 */
public class connect {

    
    public static MongoDatabase sambungDB(){
//       try {
//            MongoClient mongoClient = MongoClients.create("mongodb://admin:secure@localhost:27017/?authSource=<authenticationDb>&authMechanism=SCRAM-SHA-256");
//            MongoDatabase database = mongoClient.getDatabase("produk");
//            System.out.println("Database Connected!");
//            return database;
//        } catch (Exception e) {
//            System.out.println("Database connection failed: " + e.getMessage());
//        }
        try {
            String uri = "mongodb://localhost:27017";
            MongoClient client = MongoClients.create(uri);
            MongoDatabase database = client.getDatabase("produk");
            System.out.println("Database Connected!");
            return database;
        } catch (Exception e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
        
       return null;
    }
}
