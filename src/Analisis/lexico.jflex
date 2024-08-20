package Analisis;

import java_cup.runtime.*;
import java.util.LinkedList;
import Excepciones.Errores;

%%

%{
    public LinkedList<Errores> listaErrores = new LinkedList<>();
%}

%init{
  yyline = 1;
  yycolumn = 1;
%init}

%cup
%class scanner
%public
%line
%char
%full
%ignorecase

PAR1 = "("
PAR2 = ")"
COMA = ","
SUMA = "+"
RESTA = "-"
MULTIPLICACION = "*"
DIVISION = "/"
ID = [a-zA-Z_][a-zA-Z0-9_]*
BLANCOS = [\ \rt\f\n]+
ENTERO = [0-9]+
DECIMAL=[0-9]+"."[0-9]+

// Palabras Reservadas
GRAFICAR = "graficar"
CIRCULO = "circulo"
CUADRADO = "cuadrado"
RECTANGULO = "rectangulo"
LINEA = "linea"
POLIGONO = "poligono"
ANIMAR = "animar"
OBJETO = "objeto"
ANTERIOR = "anterior"
CURVA = "curva"
LINEAL = "lineal"

AZUL = "azul"
ROJO = "rojo"
AMARILLO = "amarillo"
VERDE = "verde"
MORADO = "morado"
NARANJA = "naranja"
GRIS = "gris"
TURQUESA = "turquesa"
FUSIA = "fusia"

%%

// Palabras reservadas
<YYINITIAL> {GRAFICAR} {return new Symbol(sym.GRAFICAR, yyline, yycolumn, yytext());}
<YYINITIAL> {CIRCULO} {return new Symbol(sym.CIRCULO, yyline, yycolumn, yytext());}
<YYINITIAL> {CUADRADO} {return new Symbol(sym.CUADRADO, yyline, yycolumn, yytext());}
<YYINITIAL> {RECTANGULO} {return new Symbol(sym.RECTANGULO, yyline, yycolumn, yytext());}
<YYINITIAL> {LINEA} {return new Symbol(sym.LINEA, yyline, yycolumn, yytext());}
<YYINITIAL> {POLIGONO} {return new Symbol(sym.POLIGONO, yyline, yycolumn, yytext());}
<YYINITIAL> {ANIMAR} {return new Symbol(sym.ANIMAR, yyline, yycolumn, yytext());}
<YYINITIAL> {CURVA} {return new Symbol(sym.CURVA, yyline, yycolumn, yytext());}
<YYINITIAL> {LINEAL} {return new Symbol(sym.LINEAL, yyline, yycolumn, yytext());}
<YYINITIAL> {OBJETO} {return new Symbol(sym.OBJETO, yyline, yycolumn, yytext());}
<YYINITIAL> {ANTERIOR} {return new Symbol(sym.ANTERIOR, yyline, yycolumn, yytext());}


// Colores
<YYINITIAL> {AZUL} {return new Symbol(sym.COLOR, yytext());}
<YYINITIAL> {ROJO} {return new Symbol(sym.COLOR, yytext());}
<YYINITIAL> {AMARILLO} {return new Symbol(sym.COLOR, yytext());}
<YYINITIAL> {VERDE} {return new Symbol(sym.COLOR, yytext());}
<YYINITIAL> {MORADO} {return new Symbol(sym.COLOR, yytext());}
<YYINITIAL> {NARANJA} {return new Symbol(sym.COLOR, yytext());}
<YYINITIAL> {GRIS} {return new Symbol(sym.COLOR, yytext());}
<YYINITIAL> {TURQUESA} {return new Symbol(sym.COLOR, yytext());}
<YYINITIAL> {FUSIA} {return new Symbol(sym.COLOR, yytext());}

// Identificadores y Números
<YYINITIAL> {ID} {return new Symbol(sym.ID, yyline, yycolumn, yytext());}
<YYINITIAL> {DECIMAL} {return new Symbol(sym.DECIMAL, yyline, yycolumn, yytext());}
<YYINITIAL> {ENTERO} {return new Symbol(sym.ENTERO, yyline, yycolumn, yytext());}

// Operadores y Delimitadores
<YYINITIAL> {PAR1} {return new Symbol(sym.PAR1, yyline, yycolumn, yytext());}
<YYINITIAL> {PAR2} {return new Symbol(sym.PAR2, yyline, yycolumn, yytext());}
<YYINITIAL> {COMA} {return new Symbol(sym.COMA, yyline, yycolumn, yytext());}
<YYINITIAL> {SUMA} {return new Symbol(sym.SUMA, yyline, yycolumn, yytext());}
<YYINITIAL> {RESTA} {return new Symbol(sym.RESTA, yyline, yycolumn, yytext());}
<YYINITIAL> {MULTIPLICACION} {return new Symbol(sym.MULTIPLICACION, yyline, yycolumn, yytext());}
<YYINITIAL> {DIVISION} {return new Symbol(sym.DIVISION, yyline, yycolumn, yytext());}

// Manejo de espacios y saltos de línea
<YYINITIAL> {BLANCOS} {/* Ignorar espacios en blanco */}

// Manejo de caracteres no válidos
<YYINITIAL> . {
    listaErrores.add(new Errores("LEXICO", "El caracter " + yytext() + " no pertenece al lenguaje", yyline, yycolumn));
}

. { System.out.println("Token no reconocido: " + yytext()); }