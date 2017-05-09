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

   Toda activity contém um ciclo de vida que é composto por estados que a activity pode possuir durante a sua existencia. <br/>
   
   ![Humorous image of software quality estimation as a count of how many expletives
you shout when reading code](https://github.com/jeanvarela/RepositorioAndroid/blob/master/imagens/CicloVida.png)

   - **onCreate**: É executada logo após a activity ser criada. É  executada apenas uma vez. Ela é respionsável por carragar os layout XML e configuração de inicialização;
   - **onStart**: É chamada logo após o **onCreate**. Também é chamada quando a activity ganha foco. Durante a execução desse metódo as seguintes ações ocorrem:<br/>
   -- Inicializa o código que mantém de UI;<br/>
   -- Registra o **BroadcastReceiver** que monitora alterações que são refletidas na interface do usuário. <br/>
   - **onResume**: Esse estado é quando a view está complemtamente carregada para interação do usuário. Ela permanece nesse estado até a activity perder o foco. Esse metódo é chamado logo após o **onStart** ou depois do **onStop**

