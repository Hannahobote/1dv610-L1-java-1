# Hur man använder Simple Auth
### Intro 
1. För att kunna navönda SimpleAuth måste ni först och främt ladda ned projectet som ett zip fill och extrahera det till det projektet ni vill använda det till.
2. Utgångspunken av modulen ligger i [SimpleAuth](src/controller/SimpleAuth.java).
    

### Modulen
Starta modulen genom att skriva koden nedan.
```java 
SimpleAuth simpleAuth = new SimpleAuth();
```

### Skapa en användare
Man kan inte använda dem andra metoderna om man inte skapar en användare först, annars kommer applikationen att sluta. Detalijerad information om felhantering finns is [test rapporten](test.md)
```java 
simpleAuth.registerUser("hannah", "password");
```

### Logga in 
Logga in genom att sktiva användar namn och lössenord på det användaren du har presic skappat. Det går inte att logga in en användare som inte är skapat. Då får du tillbaka en error.
```java
simpleAuth.signIn("hannah", "password");
```

### Info om vilken användare som är inloggad.
Med denna metoden får du infomration om vilken användare som är inloggad. Observera att denna modulen endats loggar in en användare åt taget. Att ha flera användare inloggar är inte ännu implementerad.
```java
simpleAuth.getCurrentUser();
```

### Logga ut
Logga ut en användare med denna metoden
```java
simpleAuth.signOut();
```

### Få en lista på alla registerade användare
Observera att ni måsta använda en annan public metod från concole ui klassen, för skriva ut rätt information. Alternativt, kan ni skriva en for loop, som går igenom typen arrayList<[User](src/model/User.java)>
```java
// hur metoden ser ut 
simpleAuth.getAllUsers()

// om ni använder consoleUi.java
import src.view.ConsoleUi;
ConsoleUi view = new ConsoleUi();
view.printUserDatabase(simpleAuth.getAllUsers());
```