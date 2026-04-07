# GestorNotas

**Alumno:** NICOLAS PARDO CAMPOS (1DAW)

**Descripción breve:**
Aplicación de consola desarrollada en Java para gestionar notas personales. Permite crear notas validadas, listarlas en su totalidad y aplicar filtros por importancia.

**Listado de ramas creadas:**
1. `main`
2. `feature-estructura`
3. `feature-alta-notas`
4. `feature-validacion-alta`
5. `feature-listado`
6. `feature-filtro-importancia`

**Breve explicación del conflicto resuelto:**
Se provocó un conflicto intencionado al modificar la cabecera del menú en `Main.java` simultáneamente en las ramas `main` y `feature-listado`. Al intentar fusionarlas, Git detectó la colisión y se resolvió manualmente en el editor, unificando el código y estableciendo el título final exigido: "=== GESTOR DE NOTAS - VERSION FINAL ===".

**Funcionalidad final implementada:**
- Alta de notas con autogeneración de ID.
- Validación para evitar títulos y contenidos vacíos.
- Listado completo de todas las notas.
- Listado filtrado exclusivo para notas importantes.