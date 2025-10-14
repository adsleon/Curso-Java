/*
 * Copyright (c) 2025 Rubén Bécares Álvarez
 *
 * Licencia: CC BY-NC 4.0
 * Uso permitido solo para fines personales o educativos.
 * Prohibido el uso comercial sin autorización expresa del autor.
 * Última modificación: 14/10/2025
 *
 *
 */

package es.ads.cursojava;

import es.ads.cursojava.clase02.variables.Clase02Tests;
import es.ads.cursojava.clase03.controlflujo.Clase03Tests;
import es.ads.cursojava.clase04.arrays.Clase04Tests;
import es.ads.cursojava.clase05.metodos.Clase05Tests;
import es.ads.cursojava.clase06.poo.Clase06Tests;
import es.ads.cursojava.clase07.pooprincipios.Clase07Tests;
import es.ads.cursojava.clase08.modificadorespaquetes.Clase08Tests;
import es.ads.cursojava.clase09.excepciones.Clase09Tests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Clase02Tests.class,
        Clase03Tests.class,
        Clase04Tests.class,
        Clase05Tests.class,
        Clase06Tests.class,
        Clase07Tests.class,
        Clase08Tests.class,
        Clase09Tests.class
})
public class AllTest {
}
