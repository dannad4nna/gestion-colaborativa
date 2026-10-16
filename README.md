# Sistema de Gestión de Tareas
Proyecto colaborativo en Java utilizando Gradle para la gestión de tareas.

# Gestor de tareas

## Integrantes
* Andrés Manuel Escobedo Ayala
* Danna Alejandra Ibarra Lopez
* Axel Ricardo Preciado Franco

## Descripción
Proyecto colaborativo desarrollado en Java utilizando Gradle para la gestión de tareas. Este sistema permite registrar, listar y completar tareas como parte de la práctica de gestión de repositorios con GitHub e IntelliJ IDEA.

## Requisitos
* Java Development Kit 25.0.4 
* IntelliJ IDEA Community
* Git instalado localmente
* Cuenta de GitHub

## Instalación y ejecución
1. Clonar el repositorio localmente:
   ```bash
   git clone https://github.com/dannad4nna/gestion-colaborativa.git

 ## Funcionalidades y responsbles
 * Integrante A | feature/registrar-tarea	| Crear una tarea con descripción y estado pendiente |Andrés Manuel Escobedo Ayala
 * Integrante B | feature/listar-tareas |	Mostrar todas las tareas y sus estados | Danna Alejandra Ibarra López
 * Integrante C |	feature/completar-tarea	| Marcar una tarea existente como completada | Axel Ricardo Preciado Franco

 ## Estructura del proyecto
```
gestor-tareas/
├── src/
│   ├── main/java/com/equipo/tareas/
│   │   ├── Main.java            # Menú principal y punto de entrada
│   │   ├── Tarea.java           # Modelo: título, descripción y estado
│   │   └── GestorTareas.java    # Lógica: registrar, listar y completar tareas
├── gradle/wrapper/              # Gradle Wrapper (versión reproducible de Gradle)
├── build.gradle.kts             # Configuración de compilación
├── settings.gradle.kts          # Nombre del proyecto Gradle
├── gradlew / gradlew.bat        # Scripts del Wrapper (Linux/Mac y Windows)
├── .gitignore                   # Archivos excluidos del repositorio
└── README.md                    # Documentación del proyecto


```
## Flujo de colaboración

El equipo trabaja con ramas por funcionalidad e integra los cambios mediante pull requests. No se trabaja directamente en `main`.

| Integrante | Rama | Funcionalidad |
|---|---|---|
| Andrés Escobedo (A) | `feature/registrar-tarea` | Registrar tarea |
| Danna (B) | `feature/listar-tareas` | Listar tareas |
| Axel (C) | `feature/completar-tarea` | Completar tarea |

Pasos que sigue cada integrante:

1. Sincronizar `main` (Fetch/Update) antes de empezar.
2. Crear su rama desde `main` actualizado.
3. Implementar su funcionalidad con clases y métodos de nombres descriptivos.
4. Probar la funcionalidad (prueba manual documentada en la sección Pruebas).
5. Revisar el Diff antes de confirmar.
6. Hacer commits específicos (por ejemplo, `feat: agregar listado de tareas`).
7. Publicar la rama con Push.
8. Abrir un pull request hacia `main` describiendo qué cambió, cómo se probó y qué queda pendiente.
9. Solicitar la revisión de otro integrante, que debe dejar al menos un comentario.
10. Atender la revisión e integrar el pull request con Merge.

Convenciones: mensajes de commit con prefijos `feat:` y `docs:`, un commit por cambio relacionado, y no usar `push --force` en ramas compartidas.

## Preguntas de reflexión

1. **¿Qué diferencia existe entre Git y GitHub?**
   Git es el sistema de control de versiones que corre en nuestra computadora y registra el historial de cambios. GitHub es una plataforma en línea que aloja repositorios Git y agrega herramientas de colaboración como pull requests, revisiones y gestión de colaboradores.

2. **¿Por qué conviene revisar `git diff` antes de hacer commit?**
   Porque permite ver exactamente qué líneas cambiaron y confirmar que solo se incluyen cambios intencionales. Así se evitan subir archivos que no corresponden, código de depuración o credenciales, y se escriben mensajes de commit más precisos.

3. **¿Cuál es la diferencia entre commit y push?**
   El commit guarda un registro de los cambios en el repositorio local. El push envía esos commits al repositorio remoto en GitHub para que los demás puedan verlos. Se puede hacer commit sin conexión y sin hacer push.

4. **¿Qué función tiene `.gitignore` y qué limitación presenta?**
   Indica a Git qué archivos no debe rastrear, como `build/`, `.gradle/`, `.idea/` o archivos con secretos. Su limitación es que no afecta a archivos que ya fueron rastreados: para dejar de versionarlos hay que usar `git rm --cached <ruta>` y registrar el cambio.

5. **¿Por qué se versiona el Gradle Wrapper?**
   Porque garantiza que todos los integrantes compilen con la misma versión de Gradle sin instalarla manualmente. Con `gradlew` y `gradle-wrapper.jar` en el repositorio, cualquiera que clone el proyecto puede ejecutarlo de forma reproducible.

6. **¿Cómo ayuda el README a que otra persona reproduzca el proyecto?**
   Documenta los requisitos (versiones de Java, Git e IntelliJ), los pasos de instalación y ejecución, la estructura del proyecto y las pruebas. Con esa información alguien nuevo puede clonar y ejecutar la aplicación sin preguntar al equipo.

7. **¿Qué aportan las ramas y los pull requests al control de calidad?**
   Las ramas aíslan el trabajo de cada integrante, de modo que `main` siempre conserva una versión funcional. Los pull requests obligan a que otra persona revise el código antes de integrarlo, lo que detecta errores, mejora la calidad y deja registro de qué se cambió y por qué.

8. **¿Cómo se resolvió el conflicto y qué medidas podrían evitar conflictos innecesarios?**
   (Completar después del ejercicio de la sección 8: indicar qué archivo y línea chocaron, quién integró primero, cómo se usó el editor de conflictos de IntelliJ y qué contenido final se eligió.)
   Medidas para evitarlos: hacer cambios pequeños y localizados, sincronizar con `main` con frecuencia, repartir el trabajo para que no se edite el mismo archivo y la misma línea, y comunicarse antes de modificar archivos compartidos como `Main.java` o `README.md`.


