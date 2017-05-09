# Repositório Android

  Esse repositório foi criado para armazenar códigos android que são gerado apartir do estudo da tecnologia. Para cada conceito será criado um projeto e será destinado um tópico para explicar os seus conceitos.
   
## Conteúdo

  - [Activty](#activity)
     - [Declarar Activity no Manifest](#declararActivityManifest)
     - [Ciclo de Vida da Activity](#cliclVidaActivity)
  
  
<a name="activity"></a>   
## Activity

   A  Activity é um bloco fundamental do android, ela é responsavél por representar um tela da interface. Para  criar uma activity é necessário extender a classe **Activity**. A classe **Activity** herda de **Context**, que traz informações do contexto. Através da classe **Context** conseguimos ter acesso aos recurso da aplicação.

 ```java
   public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
  }
 ```
   Quando a activity termina de ser criada é chamado o metódo **onCreate**. O layout da activity é localizado através do metódo *setContentView*. Esse layout é referenciado por *R.layout.activity_main*. <br/>
   O objeto **Bundle** é a classe usada para guardar objetos na forma chave/valor. O Bundle é usado para passar dados entre componentes Android através da classe Intent.

<a name="declararActivityManifest"></a>
## Declarar Activity no Manifest

   Para o android reconhecer a activity é necessário declarar  ela no *AndroidManifest.xml*.
   
```android
  <activity android:name=".pacote.nome"></activity>
  
  * Pacote: O pacote em que a Activity esta.
  * Nome: O nome da Activity.
```   

<a name="cliclVidaActivity"></a>
##  Ciclo de Vida da Activity

   Toda activity contém um ciclo de vida que é composto por estados que a activity pode possuir durante a sua existencia. 
