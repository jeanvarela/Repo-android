# Repositório Android

  Esse repositório foi criado para armazenar códigos android que são gerado apartir do estudo da tecnologia. Para cada conceito será criado um projeto e será destinado um tópico para explicar os seus conceitos.
   
## Conteúdo

  - [Activty](#activity)
     - [Declarar Activity no Manifest](#declararActivityManifest)
     - [Ciclo de Vida da Activity](#cliclVidaActivity)
     - [Orientação da Activity](#oriientacaoActivity)
  
  
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
   - **onResume**: Esse estado é quando a view está complemtamente carregada para interação do usuário. Ela permanece nesse estado até a activity perder o foco. Esse metódo é chamado logo após o **onStart** ou depois do **onPause**.
   - **onPause**: Esse metódo é chamado quando a activity perde o foco. Nesse metódo deve ser utilizado para interonper eventos que só devem ocorrer se a activity estiver em primeiro plano, por exemplo, a exibição de um video. Também é o momento de liberar recurso a fim de preservar a bateria. 
   - **onStop**: Esse metódo é chamado quando a activity não é mais visível ao usuário. Também que chamado quando a atividade termina de ser executada e esta preste a ser encerrada. Nessa momento os  recursos que não são mais utilizados devem ser liberados. 
   - **onDestroy**: Esse metódo destroy a activity e libera todos os recursos. Esse metódo é chamado em três situações:
   -- Utilização do método **finish()**; <br/>
   -- O sistema destroi a activity para libera espaço; <br/>
   -- A activity é destruida por causo da mudança de horientação da tela.
   
<a name="oriientacaoActivity"></a>
##  Orientação da Activity

   Uma activity pode assumir duas orientações: **portrait** ou **landscape**, que são respectivamente *retrato* e *paisagem*. <br/>
   A orientação da activity é estabelecida através de propiedade **screenOrientation**. A orientação pode ser definida atravé duas maneiras: <br/>
  - No AndroidManifest.xml
      Através da utilização da tag **android:screenOrientation**
```android
  <activity android:name=".pacote.nome"
            android:screenOrientation="portrait">
  </activity>
```   
      
  - No **onCreate** da activity
```android
  setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
```  
      
   
   
