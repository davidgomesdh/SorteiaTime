package com.example.davidsantos.sorteiatime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SorteiaActivity extends AppCompatActivity {

    private int numeroJogadores;
    private int jogadoresPorTime;
    private int totalTimes;
    private int proximos;
    private int sorteiosRestantes;
    private int contTime1 = 0;
    private int contTime2 = 0;
    private int contTime3 = 0;
    private int contTime4 = 0;
    private int contTime5 = 0;
    private int contTime6 = 0;
    private int ultimoTime = 0;

    private MeuAdaptador meuAdaptador;

    TextView txtTotalJogadores;
    TextView txtTotalTimes;
    TextView txtProximos;
    TextView txtSorteiosRestantes;
    ImageView imgTime;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteia);

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            numeroJogadores = extras.getInt("numeroJogadores");
            jogadoresPorTime = extras.getInt("JogadoresPorTime");
        }

        totalTimes = numeroJogadores/jogadoresPorTime;
        proximos = numeroJogadores%jogadoresPorTime;
        sorteiosRestantes = numeroJogadores;

        ultimoTime = totalTimes+1;

        txtTotalJogadores = findViewById(R.id.txtTotalJogadores);
        txtTotalTimes = findViewById(R.id.txtTotalTimes);
        txtProximos = findViewById(R.id.txtProximos);
        txtSorteiosRestantes = findViewById(R.id.txtSorteiosRestantes);
        imgTime = findViewById(R.id.imgTime);

        txtTotalJogadores.setText("Total jogadores: "+Integer.toString(numeroJogadores));
        txtTotalTimes.setText("Total de times: "+Integer.toString(totalTimes));
        txtProximos.setText("Jog. de proximo: "+Integer.toString(proximos));
        txtSorteiosRestantes.setText("Sorteios restantes: "+sorteiosRestantes+"/"+numeroJogadores);


        ListView listaSorteados = findViewById(R.id.listaSorteados);




        meuAdaptador = new MeuAdaptador(getApplicationContext(), R.layout.minha_celula);
        listaSorteados.setAdapter(meuAdaptador);
    }

    public void listaAdd(int time, String texto){
        Sorteio sorteio;
        sorteio = new Sorteio(time,texto);
        meuAdaptador.add(sorteio);
    }

    public void sortear(View view){
        metodoSortear();
    }

    public void metodoSortear(){

        if(sorteiosRestantes<1){
            Toast.makeText(this, "Os times ja foram montados! reinicie o aplicativo!", Toast.LENGTH_SHORT).show();
            return;
        }

        Random random = new Random();
        int x = random.nextInt(totalTimes+1);
        x++;

        String texto = "";

        switch (x){
            case 1:

                if(ultimoTime==1){
                    if(contTime1>=proximos){
                        metodoSortear();
                        break;
                    }
                    contTime1++;
                    texto = Integer.toString(contTime1)+"/"+Integer.toString(proximos);
                }
                else{
                    if(contTime1>=jogadoresPorTime){
                        metodoSortear();
                        break;
                    }
                    contTime1++;
                    texto = Integer.toString(contTime1)+"/"+Integer.toString(jogadoresPorTime);
                }


                listaAdd(R.drawable.timeazul, texto);

                sorteiosRestantes--;
                txtSorteiosRestantes.setText("Sorteios restantes: "+sorteiosRestantes+"/"+numeroJogadores);

                imgTime.setImageResource(R.drawable.timeazul);

                break;
            case 2:
                if(ultimoTime==2){
                    if(contTime2>=proximos){
                        metodoSortear();
                        break;
                    }
                    contTime2++;
                    texto = Integer.toString(contTime2)+"/"+Integer.toString(proximos);
                }
                else{
                    if(contTime2>=jogadoresPorTime){
                        metodoSortear();
                        break;
                    }
                    contTime2++;
                    texto = Integer.toString(contTime2)+"/"+Integer.toString(jogadoresPorTime);
                }


                listaAdd(R.drawable.timeverde, texto);

                sorteiosRestantes--;
                txtSorteiosRestantes.setText("Sorteios restantes: "+sorteiosRestantes+"/"+numeroJogadores);

                imgTime.setImageResource(R.drawable.timeverde);

                break;
            case 3:
                if(ultimoTime==3){
                    if(contTime3>=proximos){
                        metodoSortear();
                        break;
                    }
                    contTime3++;
                    texto = Integer.toString(contTime3)+"/"+Integer.toString(proximos);
                }
                else{
                    if(contTime3>=jogadoresPorTime){
                        metodoSortear();
                        break;
                    }
                    contTime3++;
                    texto = Integer.toString(contTime3)+"/"+Integer.toString(jogadoresPorTime);
                }

                listaAdd(R.drawable.timeamarelo, texto);

                sorteiosRestantes--;
                txtSorteiosRestantes.setText("Sorteios restantes: "+sorteiosRestantes+"/"+numeroJogadores);

                imgTime.setImageResource(R.drawable.timeamarelo);

                break;
            case 4:
                if(ultimoTime==4){
                    if(contTime4>=proximos){
                        metodoSortear();
                        break;
                    }
                    contTime4++;
                    texto = Integer.toString(contTime4)+"/"+Integer.toString(proximos);
                }
                else{
                    if(contTime4>=jogadoresPorTime){
                        metodoSortear();
                        break;
                    }
                    contTime4++;
                    texto = Integer.toString(contTime4)+"/"+Integer.toString(jogadoresPorTime);
                }

                listaAdd(R.drawable.timebranco, texto);

                sorteiosRestantes--;
                txtSorteiosRestantes.setText("Sorteios restantes: "+sorteiosRestantes+"/"+numeroJogadores);

                imgTime.setImageResource(R.drawable.timebranco);

                break;
            case 5:
                if(ultimoTime==5){
                    if(contTime5>=proximos){
                        metodoSortear();
                        break;
                    }
                    contTime5++;
                    texto = Integer.toString(contTime5)+"/"+Integer.toString(proximos);
                }
                else{
                    if(contTime5>=jogadoresPorTime){
                        metodoSortear();
                        break;
                    }
                    contTime5++;
                    texto = Integer.toString(contTime5)+"/"+Integer.toString(jogadoresPorTime);
                }

                listaAdd(R.drawable.timepreto, texto);

                sorteiosRestantes--;
                txtSorteiosRestantes.setText("Sorteios restantes: "+sorteiosRestantes+"/"+numeroJogadores);

                imgTime.setImageResource(R.drawable.timepreto);

                break;
            case 6:
                if(ultimoTime==6){
                    if(contTime6>=proximos){
                        metodoSortear();
                        break;
                    }
                    contTime6++;
                    texto = Integer.toString(contTime6)+"/"+Integer.toString(proximos);
                }
                else{
                    if(contTime6>=jogadoresPorTime){
                        metodoSortear();
                        break;
                    }
                    contTime6++;
                    texto = Integer.toString(contTime6)+"/"+Integer.toString(jogadoresPorTime);
                }

                listaAdd(R.drawable.timevermelho, texto);

                sorteiosRestantes--;
                txtSorteiosRestantes.setText("Sorteios restantes: "+sorteiosRestantes+"/"+numeroJogadores);

                imgTime.setImageResource(R.drawable.timevermelho);

                break;

        }





    }
}
