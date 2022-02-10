<p align="center">
  <img  src="https://upload.wikimedia.org/wikipedia/en/f/f2/Lumberyard_Logo.png">
</p>

## Introduccion

Un motor de videojuego es un término que hace referencia a una serie de librerías de programación que permiten el diseño, la creación y la representación de un videojuego. 
El aspecto más destacado a la hora de elegir un motor de videojuegos entre todos los disponibles que hay en el mercado son las capacidades gráficas, ya que son las encargadas de mostrar las imágenes 2D y 3D en pantalla, así como calcular algunos aspectos como los polígonos, la iluminación, las texturas… 

El presente repositorio tiene como objetivo la descripción básica de Amazon Lumberyard. Se centrara en la introduccion de esta herramienta de creacion de videojuegos,
para conocer un poco mejor esta herramienta.

## ¿Que es Amazon Lumberyard?

Amazon Lumberyard es un motor de videojuegos multiplataforma gratuito totalmente integrado con AWS (Amazon Web Services) y Twitch que proporciona el código fuente completo.
Está basado en CryEngine, cuya licencia fue otorgada por Crytek en 2015.El motor se integra con Amazon Web Services para permitir a los desarrolladores construir o alojar 
sus juegos en los servidores de Amazon, así como para soportar la transmisión en vivo a través de Twitch. Además, el motor incluye Twitch ChatPlay, lo que permite a
los espectadores del stream de Twitch influir en el juego a través del chat asociado.


<table align="center">
  
  <tr >
    <td> 
      <img width="200" src="https://user-images.githubusercontent.com/73601907/152592064-1842dcfc-fb44-46e5-b1ba-a4aaa8296165.png">
    </td>  
    <td>
      <img width="200" src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/CryEngine_Nex-Gen%284th_Generation%29.png/300px-CryEngine_Nex-Gen%284th_Generation%29.png">
    </td>  
  </tr>
  
</table>

Lumberyard se lanzó el 9 de febrero de 2016 junto con GameLift, un servicio gestionado de pago para desplegar y alojar juegos multijugador, con la intención de 
permitir a los desarrolladores el fácil desarrollo de juegos. El software está actualmente en estado beta y se puede utilizar para construir juegos para Microsoft Windows,
PlayStation 4, Xbox One, con soporte limitado para iOS yAndroid y el soporte de Linux y Mac que se planea para futuras versiones.La integración de la realidad virtual 
se agregó en la Beta 1.3, lo que permite a los desarrolladores construir juegos compatibles con dispositivos como Oculus Rift y HTC Vive. 3

El código fuente está disponible para los usuarios finales con limitaciones: 
Los usuarios no pueden liberar públicamente el código fuente del motor Lumberyard como propio ni utilizarlo para lanzar su propio motor de juego.

## Caracteristicas

Lumberyard nos ofrece una gran cantidad de características unos ejemplos serian:

- Técnicas de renderizado vanguardistas como: renderizado basado en física, iluminación global dinámica, ondulaciones dinámicas de la superficie del agua, destellos de lentes HDR, desenfoque de movimiento, profundidad de campo, entre muchas otras.
- Editor de juego en tiempo real que permite iterar en elementos de juego e inmediatamente ver los resultados.
- Red Robusta a través del uso de un subsistema de red flexible llamado GridMate. GridMate se integra con los principales servicios de red online y te permite manejar tipologías de servidor cliente peer to peer con migración de host.
- Modular Gems te ofrece una librería de varias características pre-elaboradas (cámara, controles, y entorno, entre otras) que pueden usarse para empezar nuevos proyectos rápidamente. Gems te da un mayor control sobre que tecnologías quieres incluir en tu proyecto.
- Desarrollo en C++ , Lua, y acceso total a su código fuente en C++ nativo. El motor (y todo su código fuente) se puede descargar y usar gratuitamente. Sin embargo, Amazon espera generar dinero a través del uso de su servicio de computación en la nube AWS.


## Juegos realizados con Amazon Lumberyard

Desde que se creo este motor grafico en 2016, se han creado una gran variedad de juegos, producidos por diferentes empresas, al principio estaba muy asociada a Amazon Game Studios, pero poco a poco mas empresas decidieron optar por este motor gráfico para la realizacion de videojuegos.

Unos ejemplos de juegos creados con este motor gráfico serian:

- <b>Coffence:</b>
  
  Coffence es una mezcla de juegos de lucha y shooters, se publico en Octubre de 2018 y fue desarrollado y producido por Sweet Bandits Studios.
  
  <b> Trailer </b>
  
  <table align="center">
  
  <tr >
      <td>
  
    [![Trailes Coffence](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHWdJOuNM9zDqerFkBf_kpVDIlYUcBd60Qlg&usqp=CAU)](https://www.youtube.com/watch?v=P2rBJmW4FUM)
  
  </td>  
    </tr>
    </table>
    
  <b> Imagenes </b>
  
    <table align="center">

    <tr >
      <td> 
        <img width="200" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSK_oTF9iQiVnm1LcRUnH5hsjmuUPbB37mfCQ&usqp=CAU">
      </td>  
      <td>
        <img width="200" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3HeWSZuRVFNpIBnnRvxt5nCkPOfJeQIR4YQ&usqp=CAU">
      </td>  
      <td>
        <img width="200" src="https://media.indiedb.com/images/members/5/4052/4051911/profile/space.jpg">
      </td>  
    </tr>

  </table>
  
  
- <b>The Grand Tour Game:</b>
 
  The Grand Tour Game es un juego de coches basado en el show británico de televisión automovilística para Amazon Video presentada por Jeremy Clarkson, Richard Hammond y James May, su fecha de lanzamiento fue el 15 de Enero de 2019 y fue producido y desarrollado por Amazon Game Studios y esta disponible para Playstation 4 y Xbox One
  
  <b> Trailer </b>
  
  <table align="center">
  
  <tr >
      <td>
  
    [![Traile The Grand Tour Game](https://i.blogs.es/e52649/the-grand-tour-game-key-art-86107-/1366_2000.jpg)](https://www.youtube.com/watch?v=9qGoKiDOUyA)
  
  </td>  
    </tr>
    </table>
    
  <b> Imagenes </b>
  
    <table align="center">

    <tr >
      <td> 
        <img width="200" src="https://www.gamereactor.es/media/37/grandtourgame_2823713_1200x675.png">
      </td>  
      <td>
        <img width="200" src="https://as01.epimg.net/meristation/imagenes/2018/08/22/noticias/1534937111_909096_1534937156_portada_normal.jpg">
      </td>  
      <td>
        <img width="200" src="https://mediamaster.vandal.net/i/768x432/1-2019/201912118435419_1.jpg">
      </td>  
    </tr>

  </table>
  
- <b>New World:</b>

  New World es un videojuego de rol multijugador masivo en línea (MMO) desarrollado por Amazon Game Studios, con fecha de lanzamiento  28 de septiembre de 2021.
  
  <b> Trailer </b>
  
  <table align="center">
  
  <tr >
      <td>
  
    [![Traile The Grand Tour Game](https://images.ctfassets.net/j95d1p8hsuun/29peK2k7Ic6FsPAVjHWs8W/06d3add40b23b20bbff215f6979267e8/NW_OPENGRAPH_1200x630.jpg)](https://www.youtube.com/watch?v=m1C5dLnvlzg)
  
  </td>  
    </tr>
    </table>
    
  <b> Imagenes </b>
  
    <table align="center">

    <tr >
      <td> 
        <img width="200" src="https://images.ctfassets.net/j95d1p8hsuun/46V1STydpttKqHuQqeNzJZ/c4585d6706d41b864dffb40bc652e64e/NewWorld_Combat_01_1920x1080.jpg">
      </td>  
      <td>
        <img width="200" src="https://as01.epimg.net/meristation/imagenes/2019/12/16/noticias/1576497111_002722_1576497425_sumario_normal.jpg">
      </td>  
      <td>
        <img width="200" src="https://i.3djuegos.com/juegos/13918/new_world/fotos/maestras/new_world-5544276.jpg">
      </td>  
    </tr>

  </table>



## Requisitos minimos de Amazon Lumberyard

<b>Hardware</b>

- Procesador de cuatro núcleos de 3 GHz

- 8 GB de RAM

- Tarjeta de vídeo compatible con VRAM DirectX 11 de 2 GB o posterior

- NVIDIA GeForce GTX 660 Ti con controlador versión 368.81 o posterior

- AMD Radeon HD 8730M con controlador versión 16.15.2211 o posterior

- 60 GB de espacio libre en disco

- Windwos 10

<b>Herramientas para desarrolladores</b>

Puede utilizar el Editor de Lumberyard y las herramientas sin necesidad de instalar software adicional. Para crear nuevos proyectos o utilizar 
características de desarrollo avanzadas en Lumberyard, necesita un entorno de desarrollador que incluya Microsoft Visual Studio. Las siguientes versiones son compatibles:

- (Recomendado) Versión de Microsoft Visual Studio 2019 16.2.4a través de la versión 16.9.x.
- Versión de Microsoft Visual Studio 2017 15.9.14a través de la versión 15.9.x.

Características requeridas de Visual Studio 2017 y 2019

Es posible que la instalación predeterminada de Visual Studio no incluya todas las características requeridas por Lumberyard.
Asegúrese de que las siguientes características de Visual Studio están habilitadas:

1. Lance el Instalador de Visual Studio desde el directorio de descarga o el menú Inicio si ya ha instalado Visual Studio

2. Si ha instalado Visual Studio, elijaMás - Modificaren la versión de Visual Studio que va a utilizar con Lumberyard.

3. En la pestaña Cargas de trabajo:

    - Seleccione Desarrollo de juegos con C++.

      - En el panel Detalles de instalación de la derecha, seleccione al menos un SDK de Windows 10.

    - Seleccione Desarrollo para el escritorio con C++.

4. En la página Componentes individuales pestaña, en Compiladores, herramientas de compilación y tiempo de ejecución, asegúrese de que un Conjunto de herramientas VC++ que corresponde a la versión instalada de Visual Studio se ha seleccionado:

    - Si utiliza Visual Studio 2017: Seleccione al menos una versión de la Conjunto de herramientas VC++ 2017.

    - Si utiliza Visual Studio 2019: Seleccione al menos una versión de la MSVC v142 - Herramienta de compilación VS 2019 C++ x64/x86.

      - (Opcional) Para compilar con el conjunto de herramientas de Visual Studio 2017 en Visual Studio 2019, seleccione Herramientas de compilación MSVC v141 - VS 2017 C++ x64/x86.

## Instalacion

Primero nos dirigimos a la pagina de Amazon Lumberyand para descargar el instalador:

Puedes acceder a ella con este enlace: https://docs.aws.amazon.com/es_es/lumberyard/latest/userguide/setting-up-downloading-lumberyard.html

Para utilizar el instalador de Lumberyard

1. Vaya al directorio de descargas y ejecute el archivo ejecutable del instalador de Lumberyard: LumberyardInstaller.exe

2. (Opcional)Para cambiar la ubicación de la instalación, seleccioneOpciones. La ubicación de instalación predeterminada es C:\Amazon.

3. En la página Bienvenido página del instalador, elija Instalar.

4. Siga las instrucciones para completar la instalación.

5. En la página "La instalación se ha completado correctamente", haga clic en "Inicie el asistente de configuración de Lumberyard" para instalar el software y SDK de terceros necesarios. Para obtener más información, consulte "Ejecución del asistente de configuración de Lumberyard".



El instalador de Lumberyard extrae los archivos de Lumberyard y añade accesos directos en el escritorio y en el menú de inicio para:

- Asistente de configuración de Lumberyard

- Project Configurator

- Editor de Lumberyard

Depende de las funcionalidades que aceptemos en el instalador nuestro ide tendra un aspecto u otro.

<p align="center">
  <img  src="https://cms-assets.tutsplus.com/cdn-cgi/image/width=600/uploads/users/438/posts/26245/image/Capture00.PNG">
</p>

El Lanzador te ayudará a asegurarte que siempre tengas el software necesario para la ejecución de tareas. Te muestra donde se ubica la ruta de instalación predeterminada y qué acciones pueden realizarse basándose en el software que actualmente está instalado.

Tu siguiente paso es seleccionar tres opciones:

-Ejecutar tu proyecto de juego
-Ejecutar el Editor de Lumberyard y las Herramientas
-Compilar el código del juego

<p align="center">
  <img  src="https://cms-assets.tutsplus.com/cdn-cgi/image/width=600/uploads/users/438/posts/26245/image/Capture01.PNG">
</p>

Los siguientes pasos son asegurarse de tener todo lo necesario instalado para ello nos fijamos en la interfaz si vemos que nos pone una cruz roja es que faltan paquetes por seleccionar, en caso contrario si vemos un tick verde es que esta todo correcto por lo que podemos pulsar "next".

La interfaz Summary muestra registro de actividades (basado en acciones previas) y tres principales opciones:

Configurar proyecto
Lanzar el editor de Lumberyard
Una lista de software opcional que pudieras querer instalar.
Ésta interfaz de aquí en adelante se llama Lumberyard Launcher (o simplemente Launcher). Haz click en Configure project (configurar proyecto).


<p align="center">
  <img  src="https://cms-assets.tutsplus.com/cdn-cgi/image/width=600/uploads/users/438/posts/26245/image/Capture05.PNG">
</p>

Una vez finalizado aparecera una nueva interfaz (Asset Processor). El Asset Processor es responsable de cargar los recursos del proyecto predeterminado de Lumberyard . El tiempo estimado es de poco más de 10 minutos, al finalizar veremos algo asi:

<p align="center">
  <img  src="https://cms-assets.tutsplus.com/cdn-cgi/image/width=600/uploads/users/438/posts/26245/image/Capture08.PNG">
</p>


<b>Archivos y directorios de Lumberyard</b>
Después de instalar Lumberyard, el directorio raíz de Lumberyard incluye las siguientes carpetas y archivos:

- dev

     - _WAF_— Archivos del sistema de compilación Waf.

     -  Bin64: directorio de binarios y archivos de configuración para el compilador de recursos.

     -  Bin64vc141: directorio de binarios y archivos de configuración para Visual Studio 2017.

     - Bin64vc142: directorio de binarios y archivos de configuración para Visual Studio 2019.

     - Code: directorio de archivos de código fuente y archivos de soluciones.

     - Editor— activos del editor.

     - Engine— activos del motor.

     - Gems— activos y sistemas opcionales.

     - MultiplayerSample: proyecto de muestra de multijugador que ilustra cómo crear un juego multijugador con el nuevo sistema de entidad de componentes. Para obtener más información, consulte Multiplayer Sample.

     - ProjectTemplates: archivos de configuración, bibliotecas y scripts para la plantilla vacía.

     - SamplesProject— proyecto de muestra. Para obtener más información, consulte Proyecto de ejemplos.

     - Tools— herramientas y complementos de terceros.

     - engineroot.txt— Archivo del sistema requerido por Lumberyard Setup Assistant.

- 3rdParty

     - Software de terceros necesario para utilizar o compilar Lumberyard
     - 3rdParty.txt: archivo del sistema que utilizan otras herramientas de terceros para verificar el directorio.



## Primeros pasos && Herramientas de Amazon Lumberyard

Empezamos por el  Project configurator muestra varios proyectos con configuraciones, paquetes y recursos específicos. Aquí puedes crear tus proyectos y seleccionar los recuros o configuraciones específicas que el proyecto utilizará.

Inicialmente tienes únicamente dos proyectos disponibles (MultiplayerProject y SamplesProject). Como el nombre indica, el primero es un proyecto multijugador, mientras que el segundo es un proyecto más genérico (inicialmente es el que mas se utiliza para aprender).

SamplesProject es resaltado con un palomita blanca. Ello significa que éste proyecto es el proyecto predeterminado cargado por Lumberyard. Haz click en Enable packages (Habilitar paquetes).

<p align="center">
  <img  src="https://cms-assets.tutsplus.com/cdn-cgi/image/width=600/uploads/users/438/posts/26245/image/Capture06.PNG">
</p>

Aquí accedes a las Gems (Gemas) disponibles de Lumberyard. Una Gem es una colección de recursos y otros elemenetos para extender o modificar la funcionalidad en aplicaciones Lumberyard. Varias Gems están disponibles, como puedes ver.

<p align="center">
  <img  src="https://cms-assets.tutsplus.com/cdn-cgi/image/width=600/uploads/users/438/posts/26245/image/Capture07.PNG">
</p>

Lumberyard ofrece recursos y códigos adicionales listos para usarse que puedes utilizar como por ejemplo:

- Woodland: Una colección recursos sobre naturaleza (bosque, vegetación y otros elementos naturales).
- Beach City: Una noche oscura y tormentosa que contiene varios recursos (autos, casas, vegetación).
- Legacy Games Sample: Un juego FPS listo para usarse, incluyendo complejos caracteres animados, vehículos y acciones inteligentes (IA) . Éste ejemplo usa los recursos del ejemplo woodland.

La descarga de estos paquetes se hacen mediante las Gems, por esto es importante esta funcionalidad, pues podemos utilizar herramientas y recursos adicionales para nuestro proyecto.


<b>Layout (Maquetación) del Editor</b>

Antes de utilizar el Lumberyard Editor, necesitarás aprender la configuración de su layout, y cómo navegar dentro de la Perspective Viewport (Ventana Gráfica de Perspectiva).

La interfaz del Lumberyard Editor se divide en las siguientes áreas (cada una representada numéricamente en la siguiente imagen):

1. Main menu (menú principal): Accesar a todas las funciones y configuraciones del motor de juego.

2. Editor toolbar (barra de herramientas del editor): las herramientas más comúnmente utilizadas (Select, Move, Rotate, Scale, Lock on, Ruler, Snapping, entre otras). Se compone de tres barras: EditMode, Object, Editors.

3. Viewport header: barra de búsqueda y varias opciones de visualización para la Perspective Viewport (visualizar resolución, relación de aspecto, helpers, entre otros).

4. Perspective Viewport: una vista previa de tu entorno 3D. Es dónde ocurre la acción.

5. Viewport controls: varios controles para objetos seleccionados, ubicación del mouse, velocidad de navegación, detección de colisión de la cámara, AI/Físicas y otros.

6. Console: Muestra de elementos de entrada y salida entre el usuario y el Editor.

7. Rollup Bar: Accesar a objetos y herramientas para crear y gestionar contenido en la Perspective Viewport.

<p align="center">
  <img  src="https://cms-assets.tutsplus.com/cdn-cgi/image/width=600/uploads/users/438/posts/26245/image/Capture12.jpg">
</p>

La area denominada  Rollup Bar es más compleja de lo parece inicialmente, ya que maneja todas las propiedades, definiciones y características de todos los objetos dentro de la Perspective Viewport. Por lo tanto, es importante enumerar sus pestañas:

1.Objects: contiene opciones para Inteligencia Artificial, Entidades (Actor, Arquetipo, Componente, Geometría, Partículas), Audio, Pinceles, y Prefabs, entre otros.

2.Terrain: contiene opciones para aplicar, modificar, y remover terrenos, vegetación, agujeros, Niebla, Viento, Nubes, Skyboxes y otros.

3.Modeling: contiene opciones para el manejo de la geometría, como selección de tipos de geometría y mostrar tipos (prototipo, asignación de un color único, geometría total).

4.Display: contiene opciones concernientes a la configuración de renderizado, es decir, nubes, caminos, Niebla, Terreno y Sky box (cielo), entre otros.

5.Layers: como su nombre lo indica, contiene opciones para organizar tus recursos por capas.

<p align="center">
  <img  src="https://cms-assets.tutsplus.com/cdn-cgi/image/width=600/uploads/users/438/posts/26245/image/Capture13.PNG">
</p>

Este programa ofrece modelados 3D por defecto, creados por la propia Amazon, aunque se pueden crear o importar los que queramos, acontinuación veremos ejemplos:

<p align="center">
  
  
  <img  src="https://cms-assets.tutsplus.com/cdn-cgi/image/width=600/uploads/users/438/posts/26245/image/Capture15.jpg">
</p>

Modelado por defecto

<p align="center">
  
  
  <img  src="https://cms-assets.tutsplus.com/cdn-cgi/image/width=600/uploads/users/438/posts/26245/image/Capture18.jpg">
</p>

Modelado con paquete

<p align="center">
 
  
  <img  src="https://cms-assets.tutsplus.com/cdn-cgi/image/width=600/uploads/users/438/posts/26245/final_image/lumberyard_editor_relay_1.jpg">
</p>

 Modelado realizado por diseñador 3d



   


## Hola Mundo en su lenguaje de programacion

<b>C++</b>

#include <stdio.h>

#include <stdlib.h>

int main() {

    printf("Hola Mundo \n \n");
    
    return 0;
    
}


<b>Lua</b>


print("Hola Mundo")


## Referencias

- https://aws.amazon.com/es/lumberyard/
- https://es.wikipedia.org/wiki/Amazon_Lumberyard
- https://mitsoftware.com/desarrollo-de-juegos-amazon-lumberyard/
- https://www.gamesindustry.biz/articles/2020-10-16-what-is-the-best-game-engine-is-amazon-lumberyard-right-for-you
- https://www.youtube.com/watch?v=x0p7bMO7Lk4
- https://gamedevelopment.tutsplus.com/es/tutorials/amazon-lumberyard-flow-graph--cms-26601
- https://www.thefastcode.com/es-eur/article/get-started-in-amazon-lumberyard-setting-up
- https://www.youtube.com/watch?v=x0p7bMO7Lk4
- https://bytelix.com/juegos/lumberyard-la-apuesta-de-amazon-para-entrar-en-el-mercado-de-los-videojuegos/








