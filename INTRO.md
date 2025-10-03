# Guía básica de instalación y uso de Java

## 1. Instalación de Java
1. **Descargar e instalar JDK (Java Development Kit):**
    - Sitio oficial de Oracle: [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)
    - Alternativa: OpenJDK [https://adoptium.net/](https://adoptium.net/)

2. **Verificar la instalación:**
   ```bash
   java -version
   javac -version
   ```

    Si todo está correcto, deberías ver la versión instalada.

## 2. Tu primer programa en Java

Crea un archivo llamado HolaMundo.java con el siguiente contenido:
```java
    public class HolaMundo {
        public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
        }
    }
```

## 3. Compilar un programa

En la terminal, navega hasta la carpeta donde guardaste el archivo y ejecuta:

```bash
  javac HolaMundo.java
  
  javac -encoding UTF-8 HolaMundo.java #Si imprime caracteres raros
```

Esto generará un archivo HolaMundo.class.

## 4. Ejecutar un programa

Ejecuta el archivo compilado con:

```bash
  java HolaMundo
```

Nota: No incluyas la extensión .class al ejecutar.

## 5. Estructura básica de un proyecto Java

Un proyecto Java suele organizarse de la siguiente manera:

```
    Proyecto/
    ├── src/                # Código fuente (.java)
    │    └── com/ejemplo/
    │         └── Main.java
    ├── bin/                # Archivos compilados (.class), tambien se pueden denominar build, out, class...
    └── README.md
```


Para compilar todo el proyecto desde src a bin:

```bash
  javac -d bin src/com/ejemplo/Main.java
```

Para ejecutarlo:

```bash
  java -cp bin com.ejemplo.Main
```

## 6. Variables de entorno (opcional)

Si **java** o **javac** no funcionan, agrega el bin del JDK a tu PATH.

Windows:

Ve a Panel de Control → Sistema → Configuración avanzada → Variables de entorno

Edita la variable Path y agrega:

    C:\Program Files\Java\jdk-XX\bin


Linux / macOS:
Agrega en tu archivo **~/.bashrc** o **~/.zshrc**:

    export PATH=$PATH:/usr/lib/jvm/jdk-XX/bin

## 7. Recursos útiles

[Documentación oficial de Java](https://docs.oracle.com/en/java/)

[Tutoriales básicos en W3Schools](https://www.w3schools.com/java/)

[OpenJDK](https://openjdk.org/)
