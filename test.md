Test Applikationen finns i src/controller/testApp.java. Testen är i gjort i form av en console applikation. Informationen är skriven manuellt och dem förväntade resultaten skrivs ut i terminalen- Alla tester är bort kommenterade och för att använda dem måste du ta bort snedstrecken. Observera att visa av testerna används med i kombination av andra testerna, som kan vara bort kommenterad. Instruktionerna finns i tabellen nedan.

OBS: Det går att registrera 2 användare, men det går inte att logga in på en användare när det finns 2 registrerad. Har inte kunnat lössa detta problemet ännu.

| Vad som testats / Ex metod namn, eller krav | Hur det testats | Testresultat |
| --- | --- | --- |
| test 1: simpleAuth.registerUser("hannah", "password");  | Registrerar den första användaren genom att ange användare namn och lösenord som argument. | “hannah has been registered successfully”
 |
| Test 2:   simpleAuth.registerUser("john doe", "password"); | Här registrerar vi en annan användare. Meningen med detta testet är att pröva och se om det går att registrera flera användare utan några problem. Denna testet görs med test nr.1. | “john doe has been registered successfully”
 |
| Test 3: simpleAuth.registerUser("hannah", "password"); | Registrera användare med ett användare namn som redan finns. Denna kan endast testas med test nr.1. | “hannah has been registered successfully” Exception in thread "main" java.lang.Error: The username is already beign used. Try another name. |
| Test 4: simpleAuth.registerUser("hannah2", "pass"); | Registrerar någon med ett lösenord som är för kort. Denna testset görs självständigt. | Exception in thread "main" java.lang.Error: password must at least have 6 characters
 |
| Test 5: simpleAuth.registerUser("hannah2", "123456789123456789123456466"); | Registrera användare med ett lössenord som är för långt. | Exception in thread "main" java.lang.Error: password cannot be more than 20 characters |
| Test 6: simpleAuth.signIn("hannah", "password"); | Logga in en användare som finns. Detta testet görs med test nr.1. För att se fullständig information,  använd även test nr  11. | “The user is signed in” {name: hannah, password: password, authenticated: true } |
| Test 7:  simpleAuth.signIn("hannah4", "password"); | Logga in en användare som inte finns. Detta testet kan göras med test nr1 eller självständigt.  Resultat kan variera om användaren inte finns eller om användardatabasen är tom. | “user database is empty” (om det inte finns några regisrerade användare.) ELLER “Exception in thread "main" java.lang.Error: user Does not exist”
 |
| Test 8:  simpleAuth.signIn("hannah", "password1234"); | Logga in en användare med fel lösenord. Denna testet görs med test nr 1. | Exception in thread "main" java.lang.Error: username or password is incorrect. Try again. |
| Test 9: view.printOneUser(simpleAuth.getCurrentUser()); | Skriver ut vilken användare som är inloggad just nu. Detta testet kan endast utföras med test nr 1 och 7. | will throw java.lang.NullPointerException if object is null/ not signed in OR "hannah has been registered successfully” {name: hannah, password: password, authenticated: true} |
| Test 10: simpleAuth.signOut(); | logga ut en användare som är inloggad. Denna testas med nr 1 och 7 | hannah has successfully signed out |
| Test 11: view.printUserDatabase(simpleAuth.getAllUsers()); | Skrivet ut en lista på alla registered användare. OBS kan endast fungera efter test nr 1 och/eller 2. | “hannah has been registered successfully” “john doe has been registered successfully”  {name: hannah, password: password, authenticated: false } {name: john doe, password: password, authenticated: false } |