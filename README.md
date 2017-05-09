# Repositório Android

  Esse repositório foi criado para armazenar códigos android que são gerado apartir do estudo da tecnologia. Para cada conceito será criado um projeto e será destinado um tópico para explicar os seus conceitos.
   
## Conteúdo

  - [Activty](#activity)
  
  
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
   Uma activity é iniciada através do metódo **onCreate**. O layout da activity é inicializado através do metódo *setContentView*. O layout é refenciado por *R.layout.activity_main*.
