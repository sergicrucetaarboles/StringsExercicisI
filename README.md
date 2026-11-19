# Strings Exercicis I. Col·lecció d'Exercicis en Java
 
**Centre:** La Salle Gràcia (Barcelona)
**Cicle:** Desenvolupament d'Aplicacions Web (DAW-1)
**Autor:** Sergi Cruceta
**Llenguatge:** Java
 
---
 
## Índex
 
1. Descripció del projecte
2. Requisits
3. Estructura de carpetes
4. Com compilar i executar
5. Exercici 01: Digits
6. Exercici 02: Substrings
7. Exercici 03: Upper/Lower case
8. Exercici 04: Contains
9. Exercici 05: Search Book
10. Exercici 06: Reversed
11. Exercici 07: Question
12. Exercici 08: Mini penjat
13. Exercici 09: Counter
14. Exercici 10: Classroom
15. Resum de mètodes i conceptes
16. Bones pràctiques aplicades
---
 
## 1. Descripció del projecte
 
Aquest repositori recull la resolució dels deu exercicis de la unitat formativa M03-UF1, dedicada al treball amb cadenes de text en Java. Al llarg de la sèrie es practica la classe `String` i la seva documentació oficial (Java Documentation), la interacció amb l'usuari per línia de comandes, les sentències condicionals, els bucles i els arrays.
 
Els exercicis estan ordenats de menys a més dificultat. Els primers se centren a conèixer els mètodes de `String`, i els últims combinen diverses eines per construir petits programes complets, com un cercador de llibres o un joc del penjat. Cada exercici es resol en un arxiu independent, amb comentaris al codi que expliquen cada pas.
 
## 2. Requisits
 
Per executar els programes cal tenir instal·lat el JDK (Java Development Kit), preferiblement en la versió 17 o posterior. La versió instal·lada es comprova escrivint `java -version` a la terminal. Es pot treballar amb qualsevol editor, com ara IntelliJ IDEA, Eclipse o Visual Studio Code.
 
## 3. Estructura de carpetes
 
El projecte està publicat al repositori de GitHub [StringsExercicisI](https://github.com/sergicrucetaarboles/StringsExercicisI). La seva estructura és la següent:
 
```
StringsExercicisI/
├── README.md
├── exercici01/exercici01.java
├── exercici02/exercici02.java
├── exercici03/exercici03.java
├── exercici04/exercici04.java
├── exercici05/exercici05.java
├── exercici06/exercici06.java
├── exercici07/exercici07.java
├── exercici08/exercici08.java
├── exercici09/exercici09.java
└── exercici10/exercici10.java
```
 
Cada exercici viu a la seva pròpia carpeta i té el seu propi fitxer Java.
 
## 4. Com compilar i executar
 
Cal obrir una terminal dins de la carpeta de l'exercici. Primer es compila amb `javac` i després s'executa amb `java`, sense escriure l'extensió. Com a exemple, per a l'exercici 01:
 
```bash
javac exercici01/exercici01.java
java -cp exercici01 exercici01
```

Per als altres exercicis es fa el mateix, canviant el número de l'exercici.
 
---
 
## 5. Exercici 01: Digits
 
**Objectius.** Ús de la classe `String` i ús de Java Documentation.
 
**Enunciat.** El codi següent fa servir diferents mètodes de la classe `String`. Cal executar-lo i indicar quina és la sortida per consola. A més, cal respondre a aquestes preguntes: quins mètodes de la classe `String` s'utilitzen, si són estàtics o d'instància, quina funció té cadascun, què retornen i quins paràmetres d'entrada tenen.
 
```java
public class Main {
    public static void main(String[] args) {
        double d = 858.48;
        String s = String.valueOf(d);
        int dot = s.indexOf('.');
        System.out.println(dot + " digits before decimal point");
        System.out.println((s.length() - dot - 1) + " digits after decimal point");
    }
}
```
 
**Sortida esperada.**
 
```
3 digits before decimal point
2 digits after decimal point
```
 
---
 
## 6. Exercici 02: Substrings
 
**Objectius.** Ús de la classe `String` i ús de Java Documentation.
 
**Enunciat.** Cal completar el codi on es defineix una variable `String` que conté la ruta a un fitxer, perquè mostri per consola dues dades: l'extensió del fitxer i el nom del fitxer.
 
```java
public class Main {
    public static void main(String[] args) {
        String path = "home/user/index.html";
        // insert code here
    }
}
```
 
**Pista.** Convé consultar el mètode `substring` de la classe `String` a la documentació de Java, ja que permet obtenir subcadenes d'una cadena donada. Per obtenir l'extensió del fitxer (`.html` en aquest exemple) cal localitzar el caràcter `.` dins de la ruta i extreure la subcadena des d'aquesta posició fins al final. Per obtenir el nom del fitxer (`index` en aquest exemple) cal localitzar el caràcter `/` i extreure la subcadena des d'aquesta posició fins al caràcter `.`.
 
L'esquema de la pista fa servir dues posicions: `sep = lastIndexOf('/')` i `dot = lastIndexOf('.')`. El nom s'obté amb `substring(sep + 1, dot)` i l'extensió amb `substring(dot + 1)`.
 
---
 
## 7. Exercici 03: Upper/Lower case
 
**Objectius.** Ús de la línia de comandes per interactuar amb l'usuari, ús de la classe `String` i ús de Java Documentation.
 
**Enunciat.** Cal desenvolupar un programa en Java que sol·liciti a l'usuari un text i el mostri en majúscules i en minúscules.
 
**Pista.** Abans de programar una funcionalitat, la recomanació és consultar els mètodes predefinits de la classe, en aquest cas `String`, per comprovar si ja està implementada. Cal buscar a la documentació de Java si hi ha mètodes que converteixin els caràcters d'una cadena a majúscules i a minúscules.
 
---
 
## 8. Exercici 04: Contains
 
**Objectius.** Ús de la línia de comandes per interactuar amb l'usuari, ús de la classe `String`, ús de sentències condicionals i ús de Java Documentation.
 
**Enunciat.** Cal desenvolupar un programa en Java que sol·liciti a l'usuari un text. Si el text introduït està buit, és a dir, no conté caràcters, el programa acaba. Si el text no està buit, el programa sol·licita a l'usuari una paraula i la cerca dins del text, mostrant per consola si s'ha localitzat o no.
 
---
 
## 9. Exercici 05: Search Book
 
**Objectius.** Ús de la línia de comandes per interactuar amb l'usuari, ús de sentències condicionals, ús de bucles i ús d'arrays.
 
### Tasca 1
 
**Enunciat.** Cal completar el programa següent, que disposa de la col·lecció de llibres d'una biblioteca, perquè sol·liciti a l'usuari el títol d'un llibre i li retorni si existeix al catàleg o no.
 
```java
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        String[] catalogo = {"Los muertos vivientes", "Brevísima historia del tiempo",
            "La clave secreta del universo", "Mi universo", "Patria",
            "De mayor quiero ser feliz", "Empieza por los zapatos"};
        // Insert code here
    }
}
```
 
**Exemple d'execució.**
 
```
Bienvenido a nuestra biblioteca
Escribe el título del libro que quieres buscar:
Los muertos vivientes
Se ha localizado el libro
```
 
**Pista.** Si l'usuari introdueix "los muertos vivientes" i al catàleg el títol està registrat com a "Los muertos vivientes", el resultat de la cerca ha de ser positiu. És a dir, no es tenen en compte les majúscules i minúscules. Per aconseguir-ho, la classe `String` disposa, a més del mètode `equals`, del mètode `equalsIgnoreCase`.
 
### Tasca 2
 
**Enunciat.** Habitualment les cerques no es fan introduint el títol exacte, sinó paraules del títol, cosa que facilita la cerca a l'usuari. En aquesta tasca cal modificar el codi anterior perquè, donades una o diverses paraules del títol introduïdes per l'usuari, el programa cerqui al catàleg tots els llibres que les continguin i retorni quins títols coincideixen amb el criteri de cerca.
 
**Exemple d'execució.**
 
```
Bienvenido a nuestra biblioteca
Escribe palabra o palabras del título del libro que quieres buscar:
universo
La clave secreta del universo
Mi universo
```
 
**Pista.** La classe `String` disposa de mètodes que comparen cadenes de forma exacta (`equals`, `equalsIgnoreCase`, `compareTo`), però també d'un mètode, `contains`, que permet saber si una paraula o paraules estan contingudes en una cadena de text.
 
---
 
## 10. Exercici 06: Reversed
 
**Objectius.** Ús de la línia de comandes per interactuar amb l'usuari, ús de bucles, ús de `String`, concatenació de strings i ús de Java Documentation.
 
**Enunciat.** Cal desenvolupar un programa en Java que sol·liciti a l'usuari un text i el mostri del revés.
 
**Exemple d'execució.**
 
```
Introduce un texto y pulsa enter:
Hello world
Texto invertido: dlrow olleH
```
 
**Pista.** En aquest exercici cal accedir a cada caràcter del text original per poder invertir-ne l'ordre. La classe `String` disposa del mètode `charAt(int index)`, que permet obtenir un caràcter donada una posició.
 
---
 
## 11. Exercici 07: Question
 
**Objectius.** Ús de la línia de comandes per interactuar amb l'usuari, ús de sentències condicionals, ús de `String` i ús de Java Documentation.
 
**Enunciat.** Cal desenvolupar un programa en Java que presenti una pregunta a l'usuari amb quatre possibles respostes (a, b, c, d). Només una de les respostes és correcta. L'usuari selecciona la resposta que considera correcta i el programa li indica si ha encertat o no. Si no introdueix un valor vàlid (a, b, c, d), el programa acaba.
 
**Exemples d'execució.**
 
Resposta correcta:
 
```
Indica cual de las siguientes opciones no es un tipo primitivo en Java:
a. int
b. char
c. boolean
d. String
d
Respuesta correcta!
```
 
Resposta incorrecta:
 
```
Indica cual de las siguientes opciones no es un tipo primitivo en Java:
a. int
b. char
c. boolean
d. String
a
Respuesta incorrecta, la respuesta correcta es: d
```
 
Resposta no vàlida:
 
```
Indica cual de las siguientes opciones no es un tipo primitivo en Java:
a. int
b. char
c. boolean
d. String
f
Respuesta no válida: a, b, c, d
```
 
---
 
## 12. Exercici 08: Mini penjat
 
**Objectius.** Ús de la línia de comandes per interactuar amb l'usuari, ús de sentències condicionals, ús de bucles, ús de `String` i ús de Java Documentation.
 
**Context.** El joc del penjat és un joc d'endevinalles d'un o més jugadors. Un jugador pensa una paraula o frase i la resta intenta endevinar-la suggerint lletres. Si la lletra suggerida no és a la paraula o frase, es dibuixa un element del "penjat". El joc acaba bé perquè s'ha encertat la paraula o frase, o bé perquè s'ha dibuixat completament el penjat.
 
### Tasca 1
 
**Enunciat.** Cal desenvolupar un programa en Java que disposi de la paraula o frase a endevinar i mostri per consola tants asteriscs (`*`) com lletres contingui. Si la paraula o frase conté un espai en blanc, no es dibuixa un asterisc sinó que es manté l'espai. Com a pista, sempre es dona el primer caràcter de la paraula o frase.
 
**Exemple d'execució** (la pel·lícula és Forrest Gump).
 
```
Bienvenido al Mini juego del ahorcado
Intenta adivinar la pelicula
F****** ****
```
 
### Tasca 2
 
**Enunciat.** Ara l'usuari pot suggerir una lletra. Si és a la paraula o frase a endevinar, es mostra a la seqüència.
 
**Exemple d'execució.**
 
```
Bienvenido al Mini juego del ahorcado
Intenta adivinar la pelicula
F****** ****
Introduce una letra:
r
F*rr*** ****
```
 
### Tasca 3
 
**Enunciat.** Cal ampliar el programa perquè l'usuari tingui tres intents, és a dir, que pugui arribar a suggerir tres lletres.
 
---
 
## 13. Exercici 09: Counter
 
**Objectius.** Ús de la línia de comandes per interactuar amb l'usuari, ús de sentències condicionals, ús de bucles, ús de `String` i ús de Java Documentation.
 
**Enunciat.** Cal desenvolupar un programa en Java que permeti a l'usuari introduir un text i mostri quantes paraules té i quantes vocals té. Per simplificar l'exercici, el text acaba amb un punt i la separació entre paraules és un espai en blanc.
 
**Pista.** Convé consultar a la documentació de Java els mètodes `split`, `indexOf` i `lastIndexOf` de la classe `String`.
 
---
 
## 14. Exercici 10: Classroom
 
**Objectius.** Ús de la línia de comandes per interactuar amb l'usuari, ús de bucles, ús de sentències condicionals i ús d'arrays de strings.
 
**Enunciat.** Cal desenvolupar un programa en Java que declari i inicialitzi un array amb els noms dels alumnes d'una classe. La mida de l'array i el seu contingut els tria l'alumne.
 
### Tasca 1
 
**Enunciat.** Cal mostrar per consola els noms de la classe, que són el contingut de l'array, en una mateixa línia i separats per comes.
 
**Pista.** Hi ha un detall important. Si l'array conté els noms Paula, Santiago, Pascual, Jorge, Saul i Enrique, el que es vol imprimir és `Paula, Santiago, Pascual, Jorge, Saul, Enrique` i no `Paula, Santiago, Pascual, Jorge, Saul, Enrique,`. La diferència és no imprimir l'última coma, i per evitar-ho cal fer servir la sentència `if`.
 
### Tasca 2
 
**Enunciat.** El programa ha de sol·licitar a l'usuari quina posició vol canviar. Si la posició existeix (per exemple, en un array de cinc elements són vàlides les posicions de 0 a 4), el programa en mostra el valor, és a dir, el nom, i sol·licita el nou nom. Després canvia el nom antic pel nou i mostra el contingut de l'array. Si la posició no existeix (per exemple, en un array de cinc elements no és vàlida la posició 6), el programa indica a l'usuari que la posició introduïda no existeix.
 
---
 
## 15. Resum de mètodes i conceptes
 
| Exercici | Eina principal | Idea clau |
|---|---|---|
| 01 | `valueOf`, `indexOf`, `length` | Distingir mètodes estàtics i d'instància |
| 02 | `lastIndexOf`, `substring` | El segon número de `substring` no s'inclou |
| 03 | `toUpperCase`, `toLowerCase` | Consultar abans la documentació |
| 04 | `isEmpty`, `contains` | Condicional per acabar el programa |
| 05 | `equalsIgnoreCase`, `contains` | Recórrer l'array amb un bucle |
| 06 | `charAt`, bucle, concatenació | Recórrer el text de darrere cap endavant |
| 07 | `if` / `else`, `Scanner` | Validar l'entrada de l'usuari |
| 08 | `charAt`, bucles, condicions | Construir el text ocult i revelar-lo a poc a poc |
| 09 | `split`, recorregut de caràcters | Comptar paraules i vocals |
| 10 | Arrays de `String`, `if` | No imprimir l'última coma i validar posicions |
 
## 16. Bones pràctiques aplicades
 
Tots els programes segueixen les mateixes normes de qualitat. Els noms de classes s'escriuen en format `PascalCase` i els de variables i mètodes en `camelCase`, com recomana la convenció de Java. El codi està comentat pas a pas perquè sigui fàcil de llegir. Abans de programar una funcionalitat es consulta la documentació de la classe `String`, perquè moltes operacions ja vénen implementades. A més, es controlen els casos límit, com textos buits, entrades no vàlides o posicions fora de l'array, per evitar excepcions com `StringIndexOutOfBoundsException` i `ArrayIndexOutOfBoundsException`.
 
---
 
*Treball realitzat a La Salle Gràcia, Desenvolupament d'Aplicacions Web.*
 
