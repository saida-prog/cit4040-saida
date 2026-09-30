# Errors

Three ways I broke `src/Main.java`, one at a time, with the exact compiler output.

## 1. Put text into an int

Changed `int a = 12;` to `int a = "twelve";`

```
Main.java:5: error: incompatible types: String cannot be converted to int
        int a = "twelve";
                ^
1 error
```

An `int` can only hold a whole number, so the compiler refuses to store the text "twelve" in it.

## 2. Used a variable before giving it a value

Changed `int b = 30;` to `int b;`

```
Main.java:9: error: variable b might not have been initialized
        System.out.println("a + b = " + (a + b));
                                             ^
1 error
```

`b` was declared but never given a value, so the compiler will not let me use it on line 9 because there is nothing to add.

## 3. Removed a semicolon

Changed `String name = "Saida";` to `String name = "Saida"`

```
Main.java:4: error: ';' expected
        String name = "Saida"
                             ^
1 error
```

Every statement in Java has to end with `;`, and the arrow shows the exact spot on line 4 where it is missing.
