/* 
 * Copyright 2019 Andrés Cosín Zamareño - Cousin183@gmail.com ..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Andrés Cosín Zamareño - Cousin183@gmail.com .
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        final char CHAR_MIN = 'A';
        final char CHAR_MAX = 'Z';
        final int INICIO_CUENTA = 0;
        final int FINAL_CUENTA = 6;

        int i = INICIO_CUENTA;
        char palabraAleatoria;

        System.out.print("Password ...: ");

        do {
        palabraAleatoria = (char) (RND.nextInt(CHAR_MAX - CHAR_MIN + 1) + CHAR_MIN);
                  
        i++;  
        
        System.out.printf("%c", palabraAleatoria);
        
        }while (i < FINAL_CUENTA);
        
        System.out.println("");

    }

}
