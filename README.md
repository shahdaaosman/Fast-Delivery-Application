
# Fast Delivery Application
This program represent a consortium of shops in a large city that established an agreement with local 
independent van and taxi drivers to deliver products from the stores to the customer destinations.
When a store gets a product delivery order, it creates a request which is broadcast to relevant drivers
within a certain distance from the store. A driver is then assigned based on the closest driver distance
to the shop.


# Features implemented
<p>This project was built using Observer Design Pattern.</p>
<p>using this pattern help to solve tightly coupled between objects.</p>
<p><p>when we have one-to-many dependency.</p>
  <p> -This can ensure that when one object changes state an open-ended number</p>
  <p> -of dependent objects are updated automatically.</p>
  <p> -This makes subject and observers loosely coupled.</p>
  <p> -Subject and observers have no explicit knowledge of each other.</p>
  <p> -Observers can be added and removed independently at run-time.</p>
   <p>-This add flexibility to the program.</p>

# Implementation Details
<p>1-At the binging orders data is registered in the shop system.</p>
<p>2- the order products were not implemented it just passed as null for now.</p>
<p>3- Every new driver is added to the shop system so he will be notified for the
new order.</p>
<p>4-The diver will accept all order assign to him just if he is not busy.</p>
<p>5- The shop system choose the driver with the less distance to travel.</p>
<p>6- The less distance is equal to driver distance from store with the customer distance.</p>
<p>7- The driver will be updated with all the order data the he will carry.</p>
<p>8- Driver status is "available" if he can accept order and "in transit" .
   if he is in his way to deliver an order.</p>
<p>9- If all drivers are busy the order will wait until a one driver is available.</p>
<p>10- the shop system track all driver’s status in each time tick.</p>

# Future Implantation
<p>1- The project can have more functionality if the user can place his order.</p>
<p>2- The shop system could search for the nearest store to prepare the order.</p>
<p>3- It can have GBS location for the drivers.</p>
<p>More features can be added to the (Product): </p>
<p>1-	Each product has price.</p>
<p>2-	The birthday gift is free and it just assigned to birthday person.</p>
<p>3-	User cannot get more products from the same kind.</p>
<p>4-	Assume there is enough products in each stores.</p>
<p>5-	All the stores have the same products.</p>
<p>6-	Food class has status (if is frozen) </p>
<p>7-	For warm food I assumed all driver has a delivery bag so no warry about it.</p>


# Getting Started

This project built in a Java Maven Template and it
use Apache Maven to compile and run. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run


```bash
java -classpath target/Example-1-1.0-SNAPSHOT-jar-with-dependencies.jar edu.bu.met.cs665.Main
```

or


```bash
run.sh 
```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```

# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```
