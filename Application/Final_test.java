package Application;

import java.sql.*;
import helpers.Wizard;
import static helpers.Configuration.*;
import java.util.Scanner;



public class Final_test {  
	public static int flag1=0; 
	public static Connection con;
	public static void main(String args[]) throws SQLException {
        System.out.println("Connecting...");
		try (
			Wizard wiz = new Wizard();
			Connection con = DriverManager.getConnection(
				JDBC_URL, 
				wiz.getUsername(), 
				wiz.getPassword()
			);
		) {
			System.out.println("Connected successfully.\n");
	System.out.println("Please select menu to perform operation");
	System.out.println("0- EXIT Application, 1-Insert to Customer , 2-Insert to Item , 3-Insert to Employee, 4-Insert to Supplier, 5-Insert to C_Phone");
	System.out.println("6-Insert to Buy, 7-Insert to Inventory_of_items, 8-UPDATE Employee, 9-UPDATE Supplier, 10-UPDATE Customer");
	System.out.println("11-UPDATE Item, 12- UPDATE Buy, 13-DELETE Query1, 14-DELETE Query2, 15-Join Customer & Buy, 16- Join Item & Buy,");
	System.out.println("17- Join on Item & Inventory_of_items, 18- Join on Supplier & Inventory_of_items, 19- Aggregation Query1 ");
	System.out.println("20- Aggregation Query2, 21- Correlated nested query1, 22- correlated nested query2,");
			
			int select;
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter choice");
			select=scanner.nextInt();
			while(select!=0)
			{
				try {
					switch(select)
					{
					case 1:
						if(wiz.getConfirmation("Begin the new transaction?"))
						{
							if(flag1==1)
							{
							System.out.println("Please first commit or rolback previous transaction ");
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							con.setAutoCommit(false);
							flag1=1;
							System.out.println("New transaction started");
							
							}
							else
							{
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
							}
							
						}
						final String query_1 = 
						"INSERT INTO " + "Customer" + "\n" +
						"VALUES ('1021','Russel','russel@gmail.com','Apt 10','9th street','Clarksburg','23653')";
					PreparedStatement prep_1 = con.prepareStatement(query_1);
					final int count_1 = prep_1.executeUpdate();
					System.out.println("Inserted " + count_1 + " rows" + " in Customer");
					if(flag1==1)
					{
						if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
						{
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							flag1=0;
						}
					}
						break;
					case 2:
						if(wiz.getConfirmation("Begin the new transaction?"))
						{
							if(flag1==1)
							{
							System.out.println("Please first commit or rolback previous transaction ");
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							con.setAutoCommit(false);
							flag1=1;
							System.out.println("New transaction started");
							
							}
							else
							{
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
							}
							
						}
						final String query17 = 
						"INSERT INTO " + "Item" + "\n" +
						"VALUES ('112','cashew','dry fruit',7.90)";
					PreparedStatement prep9 = con.prepareStatement(query17);
					final int count9 = prep9.executeUpdate();
					System.out.println("Inserted " + count9 + " rows" + " in Item");
					if(flag1==1)
					{
						if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
						{
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							flag1=0;
						}
					}
					
						break;
					case 3:
						if(wiz.getConfirmation("Begin the new transaction?"))
						{
							if(flag1==1)
							{
							System.out.println("Please first commit or rolback previous transaction ");
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							con.setAutoCommit(false);
							flag1=1;
							System.out.println("New transaction started");
							
							}
							else
							{
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
							}
							
						}
						final String query_2 = 
						"INSERT INTO " + "Employee" + "\n" +
						"VALUES ('3015','Pradyumna','cashier',TO_DATE('20-MAY-2016'),'3004')";
					PreparedStatement prep_2 = con.prepareStatement(query_2);
					final int count_2 = prep_2.executeUpdate();
					System.out.println("Inserted " + count_2 + " rows" + " in Employee");
					if(flag1==1)
					{
						if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
						{
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							flag1=0;
						}
					}
						break;
					case 4:
					if(wiz.getConfirmation("Begin the new transaction?"))
						{
							if(flag1==1)
							{
							System.out.println("Please first commit or rolback previous transaction ");
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							con.setAutoCommit(false);
							flag1=1;
							System.out.println("New transaction started");
							
							}
							else
							{
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
							}
							
						}
					final String query18 = 
							"INSERT INTO " + "Supplier" + "\n" +
									"VALUES ('2011','Robert foods','Jessy st','Martinsburg','23768')";
						PreparedStatement prep10 = con.prepareStatement(query18);
						final int count10 = prep10.executeUpdate();
						System.out.println("Inserted " + count10 + " rows" + " in Supplier");
						if(flag1==1)
						{
							if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
							{
								if (wiz.getConfirmation("Commit these changes?")) {
									con.commit();
									System.out.println("The changes were committed.");
								}
								else {
									con.rollback();
									System.out.println("The changes were rolled back.");}
								flag1=0;
							}
						}
						break;
					case 5:
						if(wiz.getConfirmation("Begin the new transaction?"))
						{
							if(flag1==1)
							{
							System.out.println("Please first commit or rolback previous transaction ");
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							con.setAutoCommit(false);
							flag1=1;
							System.out.println("New transaction started");
							
							}
							else
							{
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
							}
							
						}
					final String query_3 = 
							"INSERT INTO " + "C_phone" + "\n" +
									"VALUES ('1004','9998718781')";
						PreparedStatement prep_3 = con.prepareStatement(query_3);
						final int count_3 = prep_3.executeUpdate();
						System.out.println("Inserted " + count_3 + " rows" + " in C_phone");
						if(flag1==1)
						{
							if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
							{
								if (wiz.getConfirmation("Commit these changes?")) {
									con.commit();
									System.out.println("The changes were committed.");
								}
								else {
									con.rollback();
									System.out.println("The changes were rolled back.");}
								flag1=0;
							}
						}
						break;
					case 6:
						if(wiz.getConfirmation("Begin the new transaction?"))
						{
							if(flag1==1)
							{
							System.out.println("Please first commit or rolback previous transaction ");
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							con.setAutoCommit(false);
							flag1=1;
							System.out.println("New transaction started");
							
							}
							else
							{
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
							}
							
						}
						final String query_4 = 
						"INSERT INTO " + "Buy" + "\n" +
						"VALUES ('3001','1008','107',4,TO_DATE('20-MAY-2019'))";
					PreparedStatement prep_4 = con.prepareStatement(query_4);
					final int count_4 = prep_4.executeUpdate();
					System.out.println("Inserted " + count_4 + " rows" + " in Buy");
					if(flag1==1)
					{
						if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
						{
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							flag1=0;
						}
					}
						break;
					case 7:
					if(wiz.getConfirmation("Begin the new transaction?"))
							{
								if(flag1==1)
								{
								System.out.println("Please first commit or rolback previous transaction ");
								if (wiz.getConfirmation("Commit these changes?")) {
									con.commit();
									System.out.println("The changes were committed.");
								}
								else {
									con.rollback();
									System.out.println("The changes were rolled back.");}
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
								
								}
								else
								{
									con.setAutoCommit(false);
									flag1=1;
									System.out.println("New transaction started");
								}
								
							}
							final String query19 = 
								"INSERT INTO " + "Inventory_of_items" + "\n" +
										"VALUES ('109','2002','3009',94)";
							PreparedStatement prep11 = con.prepareStatement(query19);
							final int count11 = prep11.executeUpdate();
							System.out.println("Inserted " + count11 + " rows" + " in Inventory_of_items");
							if(flag1==1)
							{
								if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
								{
									if (wiz.getConfirmation("Commit these changes?")) {
										con.commit();
										System.out.println("The changes were committed.");
									}
									else {
										con.rollback();
										System.out.println("The changes were rolled back.");}
									flag1=0;
								}
							}
						break;
					case 8:
						if(wiz.getConfirmation("Begin the new transaction?"))
						{
							if(flag1==1)
							{
							System.out.println("Please first commit or rolback previous transaction ");
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							con.setAutoCommit(false);
							flag1=1;
							System.out.println("New transaction started");
							
							}
							else
							{
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
							}
							
						}
						final String query1 = 
								"UPDATE " + "Employee" + "\n" +
								"SET " + "Sup_E_id='3004'" + "\n" +
								 "WHERE " + "E_role='cashier'";
							PreparedStatement prep1 = con.prepareStatement(query1);
							final int count1 = prep1.executeUpdate();
							System.out.println("Updated " + count1 + " rows" + " in Employee");

							if(flag1==1)
							{
								if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
								{
									if (wiz.getConfirmation("Commit these changes?")) {
										con.commit();
										System.out.println("The changes were committed.");
									}
									else {
										con.rollback();
										System.out.println("The changes were rolled back.");}
									flag1=0;
								}
							}

						break;
					case 9:
						if(wiz.getConfirmation("Begin the new transaction?"))
						{
							if(flag1==1)
							{
							System.out.println("Please first commit or rolback previous transaction ");
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							con.setAutoCommit(false);
							flag1=1;
							System.out.println("New transaction started");
							
							}
							else
							{
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
							}
							
						}
						final String query2 = 
									"UPDATE " + "Supplier" + "\n" +
									"SET " + "S_name=?" + "\n" +
									 "WHERE " + "S_id='2004'";
								PreparedStatement prep2 = con.prepareStatement(query2);
								prep2.setString(1, wiz.getData("Update name of Supplier with id 2004"));
								final int count2 = prep2.executeUpdate();
								System.out.println("Updated " + count2 + " rows" + " in Supplier");

								if(flag1==1)
								{
									if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
									{
										if (wiz.getConfirmation("Commit these changes?")) {
											con.commit();
											System.out.println("The changes were committed.");
										}
										else {
											con.rollback();
											System.out.println("The changes were rolled back.");}
										flag1=0;
									}
								}

						break;
					case 10:
						if(wiz.getConfirmation("Begin the new transaction?"))
						{
							if(flag1==1)
							{
							System.out.println("Please first commit or rolback previous transaction ");
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							con.setAutoCommit(false);
							flag1=1;
							System.out.println("New transaction started");
							
							}
							else
							{
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
							}
							
						}
						final String query3 = 
										"UPDATE " + "Customer" + "\n" +
										"SET " + "C_email=?" + "\n" +
										 "WHERE " + "C_id='1001'";
									PreparedStatement prep3 = con.prepareStatement(query3);
									prep3.setString(1, wiz.getData("Update email of Customer  with id 1001"));
									final int count3 = prep3.executeUpdate();
									System.out.println("Updated " + count3 + " rows" + " in Customer");

									if(flag1==1)
									{
										if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
										{
											if (wiz.getConfirmation("Commit these changes?")) {
												con.commit();
												System.out.println("The changes were committed.");
											}
											else {
												con.rollback();
												System.out.println("The changes were rolled back.");}
											flag1=0;
										}
									}

						break;
					case 11:
						if(wiz.getConfirmation("Begin the new transaction?"))
						{
							if(flag1==1)
							{
							System.out.println("Please first commit or rolback previous transaction ");
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							con.setAutoCommit(false);
							flag1=1;
							System.out.println("New transaction started");
							
							}
							else
							{
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
							}
							
						}
						final String query4 = 
											"UPDATE " + "Item" + "\n" +
											"SET " + "item_price = ?" + "\n" +
											 "WHERE " + "item_id=101";
									PreparedStatement prep4 = con.prepareStatement(query4);
									prep4.setString(1, wiz.getData("Update price of item with id 101"));
									final int count4 = prep4.executeUpdate();
									System.out.println("Updated " + count4 + " rows" + " in Item");
									if(flag1==1)
									{
										if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
										{
											if (wiz.getConfirmation("Commit these changes?")) {
												con.commit();
												System.out.println("The changes were committed.");
											}
											else {
												con.rollback();
												System.out.println("The changes were rolled back.");}
											flag1=0;
										}
									}

						break;
					case 12:
						if(wiz.getConfirmation("Begin the new transaction?"))
						{
							if(flag1==1)
							{
							System.out.println("Please first commit or rolback previous transaction ");
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							con.setAutoCommit(false);
							flag1=1;
							System.out.println("New transaction started");
							
							}
							else
							{
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
							}
							
						}
						final String query5 = 
											"UPDATE " + "Buy" + "\n" +
											"SET " + "Quantity=4" + "\n" +
											 "WHERE " + "Employee_id='3001' AND Customer_id='1001' AND Item_id='101'";
										PreparedStatement prep5 = con.prepareStatement(query5);
										final int count5 = prep5.executeUpdate();
										System.out.println("Updated " + count5 + " rows" + "in Buy");

										if(flag1==1)
										{
											if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
											{
												if (wiz.getConfirmation("Commit these changes?")) {
													con.commit();
													System.out.println("The changes were committed.");
												}
												else {
													con.rollback();
													System.out.println("The changes were rolled back.");}
												flag1=0;
											}
										}

						break;
					case 13:
						if(wiz.getConfirmation("Begin the new transaction?"))
						{
							if(flag1==1)
							{
							System.out.println("Please first commit or rolback previous transaction ");
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							con.setAutoCommit(false);
							flag1=1;
							System.out.println("New transaction started");
							
							}
							else
							{
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
							}
							
						}
						final String query6 = 
						"DELETE FROM " + "Inventory_of_items" + "\n" +
						"WHERE Supplier_id=?";
					PreparedStatement prep6 = con.prepareStatement(query6);
					prep6.setString(1, wiz.getData("Enter Supplier_id to delete rows in Invenrory_of_items"));
					final int count6 = prep6.executeUpdate();
						System.out.println("Deleted " + count6 + " rows" + " in Inventory_of_items");

						if(flag1==1)
						{
							if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
							{
								if (wiz.getConfirmation("Commit these changes?")) {
									con.commit();
									System.out.println("The changes were committed.");
								}
								else {
									con.rollback();
									System.out.println("The changes were rolled back.");}
								flag1=0;
							}
						}

						break;
					case 14:
						if(wiz.getConfirmation("Begin the new transaction?"))
						{
							if(flag1==1)
							{
							System.out.println("Please first commit or rolback previous transaction ");
							if (wiz.getConfirmation("Commit these changes?")) {
								con.commit();
								System.out.println("The changes were committed.");
							}
							else {
								con.rollback();
								System.out.println("The changes were rolled back.");}
							con.setAutoCommit(false);
							flag1=1;
							System.out.println("New transaction started");
							
							}
							else
							{
								con.setAutoCommit(false);
								flag1=1;
								System.out.println("New transaction started");
							}
							
						}
						final String query8 = 
							"DELETE FROM " + "Inventory_of_items" + "\n" +
							"WHERE item_id=?";
						PreparedStatement prep8 = con.prepareStatement(query8);
						prep8.setString(1, wiz.getData("Enter item_id to delete rows  in Inventory_of_items"));
						
						final int count8 = prep8.executeUpdate();
						System.out.println("Deleted " + count8 + " rows" + " in Inventory_of_items");

						if(flag1==1)
						{
							if(wiz.getConfirmation("Do you wish to commit or rollback changes NOW?"))
							{
								if (wiz.getConfirmation("Commit these changes?")) {
									con.commit();
									System.out.println("The changes were committed.");
								}
								else {
									con.rollback();
									System.out.println("The changes were rolled back.");}
								flag1=0;
							}
						}
						break;
					case 15:
						final String query20 = 
								"SELECT Customer.C_name, Customer.C_email" + "\n" +
								"FROM Customer" + "\n" +
								"INNER JOIN Buy ON Customer.C_id=Buy.Customer_id";
						Statement stmt9 = con.createStatement();
						
						ResultSet rs9 = stmt9.executeQuery(query20);
						
						final ResultSetMetaData meta9 = rs9.getMetaData();
						final int columns9 = meta9.getColumnCount();
						
						for (int i = 1; i <= columns9; i++) {
							printCell(meta9.getColumnName(i));
						}
						System.out.println();
						
						while (rs9.next()) {
							for (int i = 1; i <= columns9; i++) {
								printCell(rs9.getString(i));
							}
							System.out.println();
						}
						break;
					case 16:
						final String query10 = 
								"SELECT Item.item_name, Item.item_price" + "\n" +
								"FROM Item" + "\n" +
								"INNER JOIN Buy ON Item.item_id=Buy.Item_id";
						Statement stmt2 = con.createStatement();
						
						ResultSet rs2 = stmt2.executeQuery(query10);
						
						final ResultSetMetaData meta2 = rs2.getMetaData();
						final int columns2 = meta2.getColumnCount();
						for (int i = 1; i <= columns2; i++) {
							printCell(meta2.getColumnName(i));
						}
						System.out.println();
						
						while (rs2.next()) {
							for (int i = 1; i <= columns2; i++) {
								printCell(rs2.getString(i));
							}
							System.out.println();
						}
						break;
					case 17:
						final String query11 = 
								"SELECT *" +
								"FROM Item" + "\n" +
								"LEFT OUTER JOIN Inventory_of_items ON Item.item_id=Inventory_of_items.Item_id";
						Statement stmt3 = con.createStatement();
						
						ResultSet rs3 = stmt3.executeQuery(query11);
						
						final ResultSetMetaData meta3 = rs3.getMetaData();
						final int columns3 = meta3.getColumnCount();
						
						for (int i = 1; i <= columns3; i++) {
							printCell(meta3.getColumnName(i));
						}
						System.out.println();
						
						while (rs3.next()) {
							for (int i = 1; i <= columns3; i++) {
								printCell(rs3.getString(i));
							}
							System.out.println();
						}
						break;
					case 18:
						final String query12 = 
								"SELECT Supplier.S_name" + "\n" +
								"FROM Supplier" + "\n" +
								"INNER JOIN Inventory_of_items ON Supplier.S_id=Inventory_of_items.Supplier_id";
						Statement stmt4 = con.createStatement();
						
						ResultSet rs4 = stmt4.executeQuery(query12);
						
						final ResultSetMetaData meta4 = rs4.getMetaData();
						final int columns4 = meta4.getColumnCount();
						
						for (int i = 1; i <= columns4; i++) {
							printCell(meta4.getColumnName(i));
						}
						System.out.println();
						
						while (rs4.next()) {
							for (int i = 1; i <= columns4; i++) {
								printCell(rs4.getString(i));
							}
							System.out.println();
						}
						break;
					case 19:
						final String query13 = 
						"SELECT COUNT(C_id), city" + "\n" +
						"FROM Customer" + "\n" +
						"GROUP BY city";
					Statement stmt5 = con.createStatement();
					
					ResultSet rs5 = stmt5.executeQuery(query13);
					
					final ResultSetMetaData meta5 = rs5.getMetaData();
					final int columns5 = meta5.getColumnCount();
					
					for (int i = 1; i <= columns5; i++) {
						printCell(meta5.getColumnName(i));
					}
					System.out.println();
					
					while (rs5.next()) {
						for (int i = 1; i <= columns5; i++) {
							printCell(rs5.getString(i));
						}
						System.out.println();
					}
						break;
					case 20:
						final String query14 = 
							"SELECT Item_id, SUM(Quantity)" + "\n" +
							"FROM Buy" + "\n" +
							"GROUP BY Item_id";
						Statement stmt6 = con.createStatement();
						
						ResultSet rs6 = stmt6.executeQuery(query14);
						
						final ResultSetMetaData meta6 = rs6.getMetaData();
						final int columns6 = meta6.getColumnCount();
						
						for (int i = 1; i <= columns6; i++) {
							printCell(meta6.getColumnName(i));
						}
						System.out.println();
						
						while (rs6.next()) {
							for (int i = 1; i <= columns6; i++) {
								printCell(rs6.getString(i));
							}
							System.out.println();
						}
						break;
					case 21:
						final String query15 = 
						"SELECT I.item_id, I.item_name" + "\n" +
						"FROM Item  I" + "\n" +
						"WHERE EXISTS (SELECT *" + "\n" +
						"FROM Inventory_of_items INV" + "\n" +
						"WHERE I.item_id=INV.Item_id AND INV.Quantity>2)";
					Statement stmt7 = con.createStatement();
					
					ResultSet rs7 = stmt7.executeQuery(query15);
					
					final ResultSetMetaData meta7 = rs7.getMetaData();
					final int columns7 = meta7.getColumnCount();
					
					for (int i = 1; i <= columns7; i++) {
						printCell(meta7.getColumnName(i));
					}
					System.out.println();
					
					while (rs7.next()) {
						for (int i = 1; i <= columns7; i++) {
							printCell(rs7.getString(i));
						}
						System.out.println();
					}
						break;
					case 22:
						final String query16 = 
							"SELECT C.C_id, C.C_name" + "\n" +
							"FROM Customer C" + "\n" +
							"WHERE EXISTS (SELECT *" + "\n" +
							"FROM Buy B" + "\n" +
							"WHERE C.C_id=B.Customer_id AND B.Quantity>2)";
						Statement stmt8 = con.createStatement();
						
						ResultSet rs8 = stmt8.executeQuery(query16);
						
						final ResultSetMetaData meta8 = rs8.getMetaData();
						final int columns8 = meta8.getColumnCount();
						
						for (int i = 1; i <= columns8; i++) {
							printCell(meta8.getColumnName(i));
						}
						System.out.println();
						
						while (rs8.next()) {
							for (int i = 1; i <= columns8; i++) {
								printCell(rs8.getString(i));
							}
							System.out.println();
						}

						break;
					default:
						System.out.println("Please enter valid choice");
					}
				}
				catch (SQLException e) {
					System.err.println(e.getMessage());
				}
				System.out.println("Please select menu to perform operation");
				System.out.println("0- EXIT Application, 1-Insert to Customer , 2-Insert to Item , 3-Insert to Employee, 4-Insert to Supplier, 5-Insert to C_Phone");
				System.out.println("6-Insert to Buy, 7-Insert to Inventory_of_items, 8-UPDATE Employee, 9-UPDATE Supplier, 10-UPDATE Customer");
				System.out.println("11-UPDATE Item, 12- UPDATE Buy, 13-DELETE Query1, 14-DELETE Query2, 15-Join Customer & Buy, 16- Join Item & Buy,");
				System.out.println("17- Join on Item & Inventory_of_items, 18- Join on Supplier & Inventory_of_items, 19- Aggregation Query1 ");
				System.out.println("20- Aggregation Query2, 21- Correlated nested query1, 22- correlated nested query2,");
				System.out.println("Please enter choice");
				select=scanner.nextInt();
				
			}
			scanner.close();
			if(flag1==1)
			{
				System.out.println("You have Uncommited changes");
				if (wiz.getConfirmation("You have uncommited changes do you want to commit those changes before exiting?")) {
					con.commit();
					System.out.println("The changes were committed.");
				}
				else {
					con.rollback();
					System.out.println("The changes were rolled back.");}
			}
			System.out.println("Succesfully exited Application");
		}
	}
	
	final static int MAX_LEN = 15;
	public static void printCell(String data) {
		System.out.printf(
			"%-" + MAX_LEN + "s  ", 
			data != null ? (
				data.length() <= MAX_LEN
					? data
					: data.substring(0, MAX_LEN-3) + "..."
			) : ""
		);
	}
	
}  
