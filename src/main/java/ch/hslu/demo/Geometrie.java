/*
 * Copyright 2016 Roland Gisler
 * Hochschule Luzern Informatik, Switzerland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.demo;

/**
 * Klasse mit Geometrie-Funktionen. Stellt verschiedene geometrische Funktionen zur Verfügung.
 * Derzeit aber nur eine Funktion implementiert.
 */
public final class Geometrie {

   /** Punkt keinem Quadrant zugeordnet. */
   private static final int NO_QUADRANT = 0;

   /** Quadrant 1. Positiv x, Positiv y. */
   private static final int QUADRANT_1 = 1;

   /** Quadrant 1. Negativ x, Positiv y. */
   private static final int QUADRANT_2 = 2;

   /** Quadrant 1. Negativ x, Negativ y. */
   private static final int QUADRANT_3 = 3;

   /** Quadrant 4. Positiv x, Negativ y. */
   private static final int QUADRANT_4 = 4;

   /**
    * Privater Konstruktor, weil Util-Klasse.
    */
   private Geometrie() {
   }

   /**
    * Liefert den Quadranten zu einem Koordinatenpaar. Liegen die Koordinaten auf den Achsen oder
    * auf dem Nullpunkt, liefert die Funktion den Wert '0' zurück.
    * @param x X-Koordinate.
    * @param y Y-Koordinate.
    * @return Nummer des Quadranten.
    */
   public static int getQuadrant(final int x, final int y) { // NOPMD kurze
                                                             // Namen hier ok.
      int quadrant = NO_QUADRANT;
      if (x != 0 && y != 0) {
         if (x > 0) {
            if (y > 0) {
               quadrant = QUADRANT_1;
            } else {
               quadrant = QUADRANT_4;
            }
         } else {
            if (y > 0) {
               quadrant = QUADRANT_2;
            } else {
               quadrant = QUADRANT_3;
            }
         }
      }
      return quadrant;
   }
}
