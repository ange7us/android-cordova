## Primer App en Android con Cordova #

>Este proyecto tiene la finalidad de plasmas diferentes features de Cordova/HTML5 de forma iterativa e incremental sin la necesidad de tener una finalidad puntual de producto.

Proyecto creado con el comando:


`mvn archetype:generate `
`   -DarchetypeArtifactId=android-quickstart`
`   -DarchetypeGroupId=de.akquinet.android.archetypes `
`   -DarchetypeVersion=1.0.6 `
`   -DgroupId=your.company `
`   -DartifactId=cordova-primer-app`


Importar el proyecto en Eclipse:

1. Clonar el proyecto con: git clone
2. Tener instalado en Eclipse Android SDK 20 y el conector Android m2e, que se puede obtener del marketplace.
3. Importar como un projecto Maven desde File -> Import -> Maven -> Existing Maven Projects
4. Seleccionar el archivo libs/cordova-1.7.0.jar, click derecho en Build path -> Add to buld path (Paso 3 es opcional al comienzo)
5. Run As -> Android Application.

***

Links:

1. [http://sergiandreplace.com/blog/2012/06/27/usar-maven-con-android/](http://sergiandreplace.com/blog/2012/06/27/usar-maven-con-android/)
2. [http://rgladwell.github.com/m2e-android/](http://rgladwell.github.com/m2e-android/)
3. [http://www.adobe.com/devnet/html5/articles/getting-started-with-phonegap-in-eclipse-for-android.html](http://www.adobe.com/devnet/html5/articles/getting-started-with-phonegap-in-eclipse-for-android.html)
4. [https://github.com/akquinet/android-archetypes](https://github.com/akquinet/android-archetypes)