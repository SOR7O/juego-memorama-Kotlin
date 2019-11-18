package com.example.juego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button as Button1
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        this.click()


    }


    private fun click() {
        //Inicializamos los botones que sea de tipo Button
        val button = findViewById<Button1>(R.id.button)
        val button1 = findViewById<Button1>(R.id.button1)
        val button2 = findViewById<Button1>(R.id.button3)
        val button3 = findViewById<Button1>(R.id.button2)
        val button4 = findViewById<Button1>(R.id.button4)
        val button5 = findViewById<Button1>(R.id.button5)
        val button6 = findViewById<Button1>(R.id.button6)
        val button7 = findViewById<Button1>(R.id.button7)
        val button8 = findViewById<Button1>(R.id.button8)
        val button9 = findViewById<Button1>(R.id.button9)
        val button10 = findViewById<Button1>(R.id.button10)
        val button11 = findViewById<Button1>(R.id.button11)
        val button12 = findViewById<Button1>(R.id.button12)
        val button13 = findViewById<Button1>(R.id.button13)
        val button14 = findViewById<Button1>(R.id.button14)
        val button15 = findViewById<Button1>(R.id.button15)
        val button16 = findViewById<Button1>(R.id.button16)
        val button17 = findViewById<Button1>(R.id.button17)
        val button18 = findViewById<Button1>(R.id.button18)
        val button19 = findViewById<Button1>(R.id.button19)
        val button20 = findViewById<Button1>(R.id.button20)
        val button21 = findViewById<Button1>(R.id.button21)
        val button22 = findViewById<Button1>(R.id.button22)
        val button23 = findViewById<Button1>(R.id.button23)
        val button24 = findViewById<Button1>(R.id.button24)

        //Variable que cuenta el numero de veces que pulsamos un boton que tiene un signo
        var onClickGeneral = 0

        //Asigamos imagen a cada boton por defecto tendra un signo de interrogacion
        button.setBackgroundResource(R.drawable.signo)
        button1.setBackgroundResource(R.drawable.signo)
        button3.setBackgroundResource(R.drawable.signo)
        button4.setBackgroundResource(R.drawable.signo)
        button6.setBackgroundResource(R.drawable.signo)
        button7.setBackgroundResource(R.drawable.signo)
        button8.setBackgroundResource(R.drawable.signo)
        button9.setBackgroundResource(R.drawable.signo)
        button5.setBackgroundResource(R.drawable.signo)
        button10.setBackgroundResource(R.drawable.signo)
        button11.setBackgroundResource(R.drawable.signo)
        button12.setBackgroundResource(R.drawable.signo)
        button13.setBackgroundResource(R.drawable.signo)
        button14.setBackgroundResource(R.drawable.signo)
        button15.setBackgroundResource(R.drawable.signo)
        button16.setBackgroundResource(R.drawable.signo)
        button17.setBackgroundResource(R.drawable.signo)
        button18.setBackgroundResource(R.drawable.signo)
        button19.setBackgroundResource(R.drawable.signo)
        button20.setBackgroundResource(R.drawable.signo)
        button21.setBackgroundResource(R.drawable.signo)
        button22.setBackgroundResource(R.drawable.signo)
        button23.setBackgroundResource(R.drawable.signo)
        button24.setBackgroundResource(R.drawable.signo)

        //Arreglo de imagenes que se colocaran en forma aleatoria en los botones
        val imageArray = arrayOf(
            R.drawable.benzema,
            R.drawable.jovic,
            R.drawable.rodrygo,
            R.drawable.kroos,
            R.drawable.ramos,
            R.drawable.hazard,
            R.drawable.icardi,
            R.drawable.cavani,
            R.drawable.sterling,
            R.drawable.kylian,
            R.drawable.silva,
            R.drawable.messi,
            R.drawable.alonso,
            R.drawable.cr,
            R.drawable.lorenzo,
            R.drawable.lozao,
            R.drawable.mertens,
            R.drawable.puyol,
            R.drawable.toro,
            R.drawable.mosalah,
            R.drawable.van,
            R.drawable.navas,
            R.drawable.casillas,
            R.drawable.ronaldof
        )

        //Escojemos la posicion de las imagenes en forma aleatoria
        val n = List(100) { Random.nextInt(0, 24) }


        //Inicializamos variables en 0
        //Identificador para cada vez que pulsamos un boton
        var btn = 0
        var btn1 = 0
        var btn2 = 0
        var btn3 = 0
        var btn4 = 0
        var btn5 = 0
        var btn6 = 0
        var btn7 = 0
        var btn8 = 0
        var btn9 = 0
        var btn10 = 0
        var btn11 = 0
        var btn13 = 0
        var btn14 = 0
        var btn15 = 0
        var btn16 = 0
        var btn17 = 0
        var btn18 = 0
        var btn19 = 0
        var btn20 = 0
        var btn21 = 0
        var btn22 = 0
        var btn23 = 0
        var btn24 = 0

        //Codificacion de cada boton con signo
        button.setOnClickListener {
            //Comparamos que cuantas veces a pulsado un boton
            if (onClickGeneral < 2) {
                button.setBackgroundResource(imageArray[n[0]])
                onClickGeneral++//Aumentamos cada vez que hacemos un click
                btn += 1 //LE asiganmos un valor a este boton
                button.isEnabled = false//Deshabilitamos el boton pot que ya ha sido pulsado
            } else {
                //En caso de que haya hecho dos click en la imagenes con signos mostrara el mensaje siguiente y no dejara que vea otra imagen
                //tendra que pulsar verificar
                Toast.makeText(
                    this,
                    "Ya haz seleccionado dos cartas! Pulse verificar",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        button1.setOnClickListener {
            if (onClickGeneral < 2) {
                btn1 += 2
                button1.setBackgroundResource(imageArray[n[2]])
                onClickGeneral++
                button1.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button3.setOnClickListener {
            if (onClickGeneral < 2) {
                btn2 += 3
                button3.setBackgroundResource(imageArray[n[5]])
                onClickGeneral++
                button3.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button4.setOnClickListener {
            if (onClickGeneral < 2) {
                btn3 += 4
                button4.setBackgroundResource(imageArray[n[4]])
                onClickGeneral++
                button4.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button6.setOnClickListener {
            if (onClickGeneral < 2) {
                btn4 += 5
                button6.setBackgroundResource(imageArray[n[1]])
                onClickGeneral++
                button6.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button7.setOnClickListener {
            if (onClickGeneral < 2) {
                btn5 += 6
                button7.setBackgroundResource(imageArray[n[3]])
                onClickGeneral++
                button7.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
            //Toast.makeText(this, "$rodrigoB B", Toast.LENGTH_SHORT).show()
        }
        button8.setOnClickListener {
            if (onClickGeneral < 2) {
                btn6 += 7
                button8.setBackgroundResource(imageArray[n[1]])
                onClickGeneral++
                button8.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button9.setOnClickListener {
            if (onClickGeneral < 2) {
                btn7 += 8
                button9.setBackgroundResource(imageArray[n[2]])
                onClickGeneral++
                button9.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button5.setOnClickListener {
            if (onClickGeneral < 2) {
                btn8 += 9
                button5.setBackgroundResource(imageArray[n[0]])
                onClickGeneral++
                button5.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button10.setOnClickListener {
            if (onClickGeneral < 2) {
                btn9 += 10
                button10.setBackgroundResource(imageArray[n[5]])
                onClickGeneral++
                button9.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        button11.setOnClickListener {
            if (onClickGeneral < 2) {
                btn10 += 11
                button11.setBackgroundResource(imageArray[n[4]])
                onClickGeneral++
                button11.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button12.setOnClickListener {
            if (onClickGeneral < 2) {
                btn11 += 12
                button12.setBackgroundResource(imageArray[n[3]])
                onClickGeneral++
                button12.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        button13.setOnClickListener {
            if (onClickGeneral < 2) {
                btn13 += 13
                button13.setBackgroundResource(imageArray[n[6]])
                onClickGeneral++
                button13.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button14.setOnClickListener {
            if (onClickGeneral < 2) {
                btn14 += 14
                button14.setBackgroundResource(imageArray[n[7]])
                onClickGeneral++
                button14.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button15.setOnClickListener {
            if (onClickGeneral < 2) {
                btn15 += 15
                button15.setBackgroundResource(imageArray[n[8]])
                onClickGeneral++
                button15.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button16.setOnClickListener {
            if (onClickGeneral < 2) {
                btn16 += 16
                button16.setBackgroundResource(imageArray[n[9]])
                onClickGeneral++
                button16.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button17.setOnClickListener {
            if (onClickGeneral < 2) {
                btn17 += 17
                button17.setBackgroundResource(imageArray[n[10]])
                onClickGeneral++
                button17.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button18.setOnClickListener {
            if (onClickGeneral < 2) {
                btn18 += 18
                button18.setBackgroundResource(imageArray[n[11]])
                onClickGeneral++
                button18.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button19.setOnClickListener {
            if (onClickGeneral < 2) {
                btn19 += 19
                button19.setBackgroundResource(imageArray[n[6]])
                onClickGeneral++
                button19.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button20.setOnClickListener {
            if (onClickGeneral < 2) {
                btn20 += 20
                button20.setBackgroundResource(imageArray[n[7]])
                onClickGeneral++
                button20.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button21.setOnClickListener {
            if (onClickGeneral < 2) {
                btn21 += 21
                button21.setBackgroundResource(imageArray[n[8]])
                onClickGeneral++
                button21.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button22.setOnClickListener {
            if (onClickGeneral < 2) {
                btn22 += 22
                button22.setBackgroundResource(imageArray[n[9]])
                onClickGeneral++
                button22.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button23.setOnClickListener {
            if (onClickGeneral < 2) {
                btn23 += 23
                button23.setBackgroundResource(imageArray[n[10]])
                onClickGeneral++
                button23.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        button24.setOnClickListener {
            if (onClickGeneral < 2) {
                btn24 += 24
                button24.setBackgroundResource(imageArray[n[11]])
                onClickGeneral++
                button24.isEnabled = false
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        //Boton verificar
        //Al hacer click en este boton comparara si la imagen que ha descubierto es igual a la otra que ha descubierto

        button2.setOnClickListener {

            //Comparamos que si no ha hecho los dos clicks no podra ver si es correcta o incorrecta las imagenes descubiertas
            if (onClickGeneral < 2) {
                Toast.makeText(this, "Selecciona otra carta", Toast.LENGTH_SHORT).show()
            } else {
                //Comparamos en caso de ser igual este boton se dehabilitara
                if (btn == 1 && btn8 == 9) {
                    button.isEnabled = false
                    button5.isEnabled = false
                    onClickGeneral -= 2
                    btn1 -= 1
                    btn8 -= 9
                }
                if (btn1 == 2 && btn7 == 8) {
                    button1.isEnabled = false
                    button9.isEnabled = false
                    onClickGeneral -= 2
                    btn1 -= 2
                    btn7 -= 8
                }
                if (btn2 == 3 && btn9 == 10) {
                    button3.isEnabled = false
                    button10.isEnabled = false
                    onClickGeneral -= 2
                    btn2 -= 3
                    btn9 -= 10
                }
                if (btn3 == 4 && btn10 == 11) {
                    button4.isEnabled = false
                    button11.isEnabled = false
                    onClickGeneral -= 2
                    btn3 -= 4
                    btn10 -= 11
                }
                if (btn4 == 5 && btn6 == 7) {
                    button6.isEnabled = false
                    button8.isEnabled = false
                    onClickGeneral -= 2
                    btn4 -= 5
                    btn6 -= 7
                }
                if (btn5 == 6 && btn11 == 12) {
                    button7.isEnabled = false
                    button12.isEnabled = false
                    onClickGeneral -= 2
                    btn5 -= 6
                    btn11 -= 12
                }
                if (btn13 == 13 && btn24 == 24) {
                    button13.isEnabled = false
                    button24.isEnabled = false
                    onClickGeneral -= 2
                    btn13 -= 13
                    btn24 -= 24
                }
                if (btn14 == 14 && btn23 == 23) {
                    button14.isEnabled = false
                    button24.isEnabled = false
                    onClickGeneral -= 2
                    btn14 -= 14
                    btn23 -= 23
                }
                if (btn15 == 15 && btn22 == 22) {
                    button15.isEnabled = false
                    button22.isEnabled = false
                    onClickGeneral -= 2
                    btn22 -= 22
                    btn15 -= 15
                }
                if (btn16 == 16 && btn21 == 21) {
                    button16.isEnabled = false
                    button21.isEnabled = false
                    onClickGeneral -= 2
                    btn16 -= 16
                    btn21 -= 21
                }
                if (btn17 == 17 && btn20 == 20) {
                    button17.isEnabled = false
                    button20.isEnabled = false
                    onClickGeneral -= 2
                    btn17 -= 17
                    btn20 -= 20
                }
                if (btn18 == 18 && btn19 == 19) {
                    button18.isEnabled = false
                    button19.isEnabled = false
                    onClickGeneral -= 2
                    btn19 -= 19
                    btn18 -= 18
                }
                //Empezamos a comparar si son diferentes
                if (btn == 1 && btn1 == 2) {
                    //Al no ser iguales vuelven a la imagen de signo
                    button.setBackgroundResource(R.drawable.signo)
                    button1.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn -= 1
                    btn1 -= 2
                    //Como no son iguales los volvemos a habilitar los botones
                    button1.isEnabled = true
                    button.isEnabled = true
                }
                if (btn == 1 && btn2 == 3) {
                    button.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn -= 1
                    btn2 -= 3
                    button.isEnabled = true
                    button3.isEnabled = true
                }
                if (btn == 1 && btn3 == 4) {
                    button.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn -= 1
                    btn3 -= 4
                    button.isEnabled = true
                    button4.isEnabled = true
                }
                if (btn == 1 && btn4 == 5) {
                    button.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn -= 1
                    btn4 -= 5
                    button6.isEnabled = true
                    button.isEnabled = true
                }
                if (btn == 1 && btn5 == 6) {
                    button.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn -= 1
                    btn5 -= 6
                    button7.isEnabled = true
                    button.isEnabled = true
                }
                if (btn == 1 && btn6 == 7) {
                    button.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn -= 1
                    btn6 -= 7
                    button8.isEnabled = true
                    button.isEnabled = true
                }
                if (btn == 1 && btn7 == 8) {
                    button.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn -= 1
                    btn7 -= 8
                    button8.isEnabled = true
                    button.isEnabled = true
                }
                if (btn == 1 && btn8 == 9) {
                    button.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn -= 1
                    btn8 -= 9
                    button9.isEnabled = true
                    button.isEnabled = true
                }
                if (btn == 1 && btn9 == 10) {
                    button.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn -= 1
                    btn9 -= 10
                    button10.isEnabled = true
                    button.isEnabled = true
                }
                if (btn == 1 && btn10 == 11) {
                    button.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn -= 1
                    btn10 -= 11
                    button11.isEnabled = true
                    button.isEnabled = true
                }
                if (btn == 1 && btn11 == 12) {
                    button.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn -= 1
                    btn11 -= 12
                    button12.isEnabled = true
                    button.isEnabled = true
                }
                if (btn1 == 2 && btn2 == 3) {
                    button1.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn1 -= 2
                    btn2 -= 3
                    button1.isEnabled = true
                    button3.isEnabled = true
                }
                if (btn1 == 2 && btn3 == 4) {
                    button1.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn1 -= 2
                    btn3 -= 4
                    button1.isEnabled = true
                    button4.isEnabled = true
                }
                if (btn1 == 2 && btn4 == 5) {
                    button1.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn1 -= 2
                    btn4 -= 5
                    button1.isEnabled = true
                    button6.isEnabled = true
                }
                if (btn1 == 2 && btn5 == 6) {
                    button1.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn1 -= 2
                    btn5 -= 6
                    button1.isEnabled = true
                    button7.isEnabled = true
                }
                if (btn1 == 2 && btn6 == 7) {
                    button1.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn1 -= 2
                    btn6 -= 7
                    button1.isEnabled = true
                    button8.isEnabled = true
                }
                if (btn1 == 2 && btn8 == 9) {
                    button1.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn1 -= 2
                    btn8 -= 9
                    button1.isEnabled = true
                    button5.isEnabled = true
                }
                if (btn1 == 2 && btn9 == 10) {
                    button1.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn1 -= 2
                    btn9 -= 10
                    button1.isEnabled = true
                    button10.isEnabled = true
                }
                if (btn1 == 2 && btn10 == 11) {
                    button1.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn1 -= 2
                    btn10 -= 11
                    button1.isEnabled = true
                    button11.isEnabled = true
                }
                if (btn1 == 2 && btn11 == 12) {
                    button1.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn1 -= 2
                    btn11 -= 12
                    button1.isEnabled = true
                    button12.isEnabled = true
                }
                if (btn2 == 3 && btn3 == 4) {
                    button3.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn2 -= 3
                    btn3 -= 4
                    button3.isEnabled = true
                    button4.isEnabled = true
                }
                if (btn2 == 3 && btn4 == 5) {
                    button3.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn2 -= 3
                    btn4 -= 5
                    button3.isEnabled = true
                    button6.isEnabled = true
                }
                if (btn2 == 3 && btn5 == 6) {
                    button3.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn2 -= 3
                    btn5 -= 6
                    button3.isEnabled = true
                    button7.isEnabled = true
                }
                if (btn2 == 3 && btn6 == 7) {
                    button3.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn2 -= 3
                    btn6 -= 7
                    button6.isEnabled = true
                    button3.isEnabled = true
                }
                if (btn2 == 3 && btn8 == 9) {
                    button3.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn2 -= 3
                    btn8 -= 9
                    button2.isEnabled = true
                    button8.isEnabled = true
                }
                if (btn2 == 3 && btn10 == 11) {
                    button3.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn2 -= 3
                    btn10 -= 11
                    button10.isEnabled = true
                    button2.isEnabled = true
                }
                if (btn2 == 3 && btn11 == 12) {
                    button3.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn2 -= 3
                    btn11 -= 12
                    button11.isEnabled = true
                    button2.isEnabled = true
                }

                if (btn3 == 4 && btn4 == 5) {
                    button4.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn3 -= 4
                    btn4 -= 5
                    button3.isEnabled = true
                    button4.isEnabled = true
                }
                if (btn3 == 4 && btn5 == 6) {
                    button4.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn3 -= 4
                    btn5 -= 6
                    button3.isEnabled = true
                    button5.isEnabled = true
                }
                if (btn3 == 4 && btn6 == 7) {
                    button4.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn3 -= 4
                    btn6 -= 7
                    button3.isEnabled = true
                    button6.isEnabled = true
                }
                if (btn3 == 4 && btn7 == 8) {
                    button4.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn3 -= 4
                    btn7 -= 8
                    button3.isEnabled = true
                    button7.isEnabled = true
                }
                if (btn3 == 4 && btn8 == 9) {
                    button4.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn3 -= 4
                    btn8 -= 9
                    button4.isEnabled = true
                    button5.isEnabled = true
                }
                if (btn3 == 4 && btn11 == 12) {
                    button4.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn3 -= 4
                    btn11 -= 12
                    button11.isEnabled = true
                    button3.isEnabled = true
                }
                if (btn4 == 5 && btn5 == 6) {
                    button6.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn4 -= 5
                    btn5 -= 6
                    button6.isEnabled = true
                    button7.isEnabled = true
                }
                if (btn4 == 5 && btn8 == 9) {
                    button6.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn4 -= 5
                    btn8 -= 9
                    button8.isEnabled = true
                    button4.isEnabled = true
                }
                if (btn4 == 5 && btn11 == 12) {
                    button6.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn4 -= 5
                    btn11 -= 12
                    button11.isEnabled = true
                    button4.isEnabled = true
                }

                if (btn5 == 6 && btn8 == 9) {
                    button7.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn5 -= 6
                    btn8 -= 9
                    button5.isEnabled = true
                    button8.isEnabled = true
                }
                if (btn9 == 10 && btn7 == 8) {
                    button9.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    onClickGeneral -= 2
                    btn9 -= 10
                    btn7 -= 8
                    button9.isEnabled = true
                    button7.isEnabled = true
                }
                if (btn7 == 8 && btn8 == 9) {
                    button5.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn7 -= 8
                    btn8 -= 9
                    onClickGeneral -= 2
                    button5.isEnabled = true
                    button9.isEnabled = true
                }
                if (btn7 == 8 && btn10 == 11) {
                    button11.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn7 -= 8
                    btn10 -= 11
                    onClickGeneral -= 2
                    button10.isEnabled = true
                    button7.isEnabled = true
                }
                if (btn7 == 8 && btn11 == 12) {
                    button12.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn7 -= 8
                    btn11 -= 12
                    onClickGeneral -= 2
                    button7.isEnabled = true
                    button11.isEnabled = true
                }

                if (btn7 == 8 && btn2 == 3) {
                    button3.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn7 -= 8
                    btn2 -= 3
                    onClickGeneral -= 2
                    button7.isEnabled = true
                    button2.isEnabled = true
                }
                if (btn7 == 8 && btn4 == 5) {
                    button6.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn7 -= 8
                    btn4 -= 5
                    onClickGeneral -= 2
                    button4.isEnabled = true
                    button7.isEnabled = true
                }
                if (btn7 == 8 && btn6 == 7) {
                    button8.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn7 -= 8
                    btn6 -= 7
                    onClickGeneral -= 2
                    button7.isEnabled = true
                    button6.isEnabled = true
                }
                if (btn9 == 10 && btn5 == 6) {
                    button7.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    btn9 -= 10
                    btn5 -= 6
                    onClickGeneral -= 2
                    button9.isEnabled = true
                    button5.isEnabled = true
                }
                if (btn6 == 7 && btn5 == 6) {
                    button8.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    btn6 -= 7
                    btn5 -= 6
                    onClickGeneral -= 2
                    button6.isEnabled = true
                    button5.isEnabled = true
                }
                if (btn8 == 9 && btn9 == 10) {
                    button10.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    btn8 -= 9
                    btn9 -= 10
                    onClickGeneral -= 2
                    button10.isEnabled = true
                    button5.isEnabled = true
                }
                if (btn13 == 13 && btn == 1) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn -= 1
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button.isEnabled = true
                }
                if (btn13 == 13 && btn1 == 2) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button1.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn1 -= 2
                    onClickGeneral -= 2
                    button1.isEnabled = true
                    button13.isEnabled = true
                }
                if (btn13 == 13 && btn2 == 3) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn2 -= 3
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button2.isEnabled = true
                }
                if (btn13 == 13 && btn3 == 4) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn3 -= 4
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button3.isEnabled = true
                }
                if (btn13 == 13 && btn4 == 5) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn4 -= 5
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button4.isEnabled = true
                }
                if (btn13 == 13 && btn5 == 6) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn5 -= 6
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button7.isEnabled = true
                }
                if (btn13 == 13 && btn6 == 7) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn6 -= 7
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button8.isEnabled = true
                }
                if (btn13 == 13 && btn7 == 8) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn7 -= 8
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button7.isEnabled = true
                }
                if (btn13 == 13 && btn8 == 9) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn8 -= 9
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button8.isEnabled = true
                }
                if (btn13 == 13 && btn9 == 10) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn9 -= 10
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button9.isEnabled = true
                }
                if (btn13 == 13 && btn10 == 11) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn10 -= 11
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button11.isEnabled = true
                }
                if (btn13 == 13 && btn11 == 12) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn11 -= 12
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button12.isEnabled = true
                }
                if (btn13 == 13 && btn14 == 14) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button14.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn14 -= 14
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button14.isEnabled = true
                }
                if (btn13 == 13 && btn15 == 15) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button15.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn15 -= 15
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button15.isEnabled = true
                }
                if (btn13 == 13 && btn16 == 16) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button16.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn16 -= 16
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button16.isEnabled = true
                }
                if (btn13 == 13 && btn17 == 17) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button17.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn17 -= 17
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button17.isEnabled = true
                }
                if (btn13 == 13 && btn18 == 18) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button18.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn18 -= 18
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button18.isEnabled = true
                }
                if (btn13 == 13 && btn19 == 19) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button19.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn19 -= 19
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button19.isEnabled = true
                }
                if (btn13 == 13 && btn20 == 20) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button20.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn20 -= 20
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button20.isEnabled = true
                }
                if (btn13 == 13 && btn21 == 21) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button21.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn21 -= 21
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button21.isEnabled = true
                }
                if (btn13 == 13 && btn22 == 22) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button22.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn22 -= 22
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button22.isEnabled = true
                }
                if (btn13 == 13 && btn23 == 23) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button23.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn23 -= 23
                    onClickGeneral -= 2
                    button13.isEnabled = true
                    button23.isEnabled = true
                }

                if (btn14 == 14 && btn == 1) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn -= 1
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button.isEnabled = true
                }
                if (btn14 == 14 && btn1 == 2) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button1.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn1 -= 2
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button1.isEnabled = true
                }
                if (btn14 == 14 && btn2 == 3) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn2 -= 3
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button3.isEnabled = true
                }
                if (btn14 == 14 && btn3 == 4) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn3 -= 4
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button4.isEnabled = true
                }
                if (btn14 == 14 && btn4 == 5) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn4 -= 5
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button6.isEnabled = true
                }
                if (btn14 == 14 && btn5 == 6) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn5 -= 6
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button7.isEnabled = true
                }
                if (btn14 == 14 && btn6 == 7) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn6 -= 7
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button8.isEnabled = true
                }
                if (btn14 == 14 && btn7 == 8) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn7 -= 8
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button9.isEnabled = true
                }
                if (btn14 == 14 && btn8 == 9) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn8 -= 9
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button5.isEnabled = true
                }
                if (btn14 == 14 && btn9 == 10) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn9 -= 10
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button10.isEnabled = true
                }
                if (btn14 == 14 && btn10 == 11) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn10 -= 11
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button11.isEnabled = true
                }
                if (btn14 == 14 && btn11 == 12) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn1 -= 12
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button12.isEnabled = true
                }
                if (btn14 == 14 && btn14 == 14) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button14.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn14 -= 14
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button14.isEnabled = true
                }
                if (btn14 == 14 && btn15 == 15) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button15.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn15 -= 15
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button15.isEnabled = true
                }
                if (btn14 == 14 && btn16 == 16) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button16.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn16 -= 16
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button16.isEnabled = true
                }
                if (btn14 == 14 && btn17 == 17) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button17.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn17 -= 17
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button17.isEnabled = true
                }
                if (btn14 == 14 && btn18 == 18) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button18.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn18 -= 18
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button18.isEnabled = true
                }
                if (btn14 == 14 && btn19 == 19) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button19.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn19 -= 19
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button19.isEnabled = true
                }
                if (btn14 == 14 && btn20 == 20) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button20.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn20 -= 20
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button20.isEnabled = true
                }
                if (btn14 == 14 && btn21 == 21) {
                    button13.setBackgroundResource(R.drawable.signo)
                    button21.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn21 -= 21
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button21.isEnabled = true
                }
                if (btn14 == 14 && btn22 == 22) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button22.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn22 -= 22
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button22.isEnabled = true
                }
                if (btn14 == 14 && btn24 == 24) {
                    button14.setBackgroundResource(R.drawable.signo)
                    button23.setBackgroundResource(R.drawable.signo)
                    btn14 -= 14
                    btn23 -= 23
                    onClickGeneral -= 2
                    button14.isEnabled = true
                    button24.isEnabled = true
                }

                if (btn15 == 15 && btn == 1) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn -= 1
                    onClickGeneral -= 2
                    button15.isEnabled = true
                    button.isEnabled = true
                }
                if (btn15 == 15 && btn1 == 2) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button1.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn1 -= 2
                    onClickGeneral -= 2
                    button15.isEnabled = true
                    button1.isEnabled = true
                }
                if (btn15 == 15 && btn2 == 3) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn2 -= 3
                    button15.isEnabled = true
                    button3.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn3 == 4) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn3 -= 4
                    button15.isEnabled = true
                    button4.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn4 == 5) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn4 -= 5
                    button15.isEnabled = true
                    button6.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn5 == 6) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn5 -= 6
                    button15.isEnabled = true
                    button7.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn6 == 7) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn6 -= 7
                    button15.isEnabled = true
                    button8.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn7 == 8) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn7 -= 8
                    onClickGeneral -= 2
                    button15.isEnabled = true
                    button9.isEnabled = true
                }
                if (btn15 == 15 && btn8 == 9) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn8 -= 9
                    onClickGeneral -= 2
                    button15.isEnabled = true
                    button5.isEnabled = true
                }
                if (btn15 == 15 && btn9 == 10) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn9 -= 10
                    button15.isEnabled = true
                    button10.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn10 == 11) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn10 -= 11
                    button15.isEnabled = true
                    button11.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn11 == 12) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn1 -= 12
                    button15.isEnabled = true
                    button12.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn14 == 14) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button14.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn14 -= 14
                    button15.isEnabled = true
                    button14.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn15 == 15) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button15.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn15 -= 15
                    button15.isEnabled = true
                    button15.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn16 == 16) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button16.setBackgroundResource(R.drawable.signo)
                    btn13 -= 15
                    btn16 -= 16
                    button15.isEnabled = true
                    button16.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn17 == 17) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button17.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn17 -= 17
                    button15.isEnabled = true
                    button17.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn18 == 18) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button18.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn18 -= 18
                    button15.isEnabled = true
                    button18.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn19 == 19) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button19.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn19 -= 19
                    button15.isEnabled = true
                    button19.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn20 == 20) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button20.setBackgroundResource(R.drawable.signo)
                    btn13 -= 13
                    btn20 -= 20
                    button15.isEnabled = true
                    button20.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn21 == 21) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button21.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn21 -= 21
                    button15.isEnabled = true
                    button21.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn22 == 24) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button24.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn24 -= 24
                    button15.isEnabled = true
                    button14.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn15 == 15 && btn23 == 23) {
                    button15.setBackgroundResource(R.drawable.signo)
                    button23.setBackgroundResource(R.drawable.signo)
                    btn15 -= 15
                    btn23 -= 23
                    button15.isEnabled = true
                    button23.isEnabled = true
                    onClickGeneral -= 2
                }

                if (btn16 == 16 && btn == 1) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn -= 1
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button.isEnabled = true
                }
                if (btn16 == 16 && btn1 == 2) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button1.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn1 -= 2
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button1.isEnabled = true
                }
                if (btn16 == 16 && btn2 == 3) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn2 -= 3
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button3.isEnabled = true
                }
                if (btn16 == 16 && btn3 == 4) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn3 -= 4
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button4.isEnabled = true
                }
                if (btn16 == 16 && btn4 == 5) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn4 -= 5
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button6.isEnabled = true
                }
                if (btn16 == 16 && btn5 == 6) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn5 -= 6
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button7.isEnabled = true
                }
                if (btn16 == 16 && btn6 == 7) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn6 -= 7
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button8.isEnabled = true
                }
                if (btn16 == 16 && btn7 == 8) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn7 -= 8
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button9.isEnabled = true
                }
                if (btn16 == 16 && btn8 == 9) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn8 -= 9
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button5.isEnabled = true
                }
                if (btn16 == 16 && btn9 == 10) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn9 -= 10
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button10.isEnabled = true
                }
                if (btn16 == 16 && btn10 == 11) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn10 -= 11
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button11.isEnabled = true
                }
                if (btn16 == 16 && btn11 == 12) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn11 -= 12
                    button16.isEnabled = true
                    button12.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn16 == 16 && btn14 == 14) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button14.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn14 -= 14
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button14.isEnabled = true
                }
                if (btn16 == 16 && btn15 == 15) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button15.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn15 -= 15
                    button16.isEnabled = true
                    button15.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn16 == 16 && btn16 == 16) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button16.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn16 -= 16
                    button16.isEnabled = true
                    button16.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn16 == 16 && btn17 == 17) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button17.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn17 -= 17
                    button16.isEnabled = true
                    button17.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn16 == 16 && btn18 == 18) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button18.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn18 -= 18
                    button16.isEnabled = true
                    button18.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn16 == 16 && btn19 == 19) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button19.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn19 -= 19
                    button16.isEnabled = true
                    button19.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn16 == 16 && btn20 == 20) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button20.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn20 -= 20
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button20.isEnabled = true
                }
                if (btn16 == 16 && btn24 == 24) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button24.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn24 -= 24
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button24.isEnabled = true
                }
                if (btn16 == 16 && btn22 == 22) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button22.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn22 -= 22
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button22.isEnabled = true
                }
                if (btn16 == 16 && btn23 == 23) {
                    button16.setBackgroundResource(R.drawable.signo)
                    button23.setBackgroundResource(R.drawable.signo)
                    btn16 -= 16
                    btn23 -= 23
                    onClickGeneral -= 2
                    button16.isEnabled = true
                    button23.isEnabled = true
                }


                if (btn17 == 17 && btn == 1) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn -= 1
                    onClickGeneral -= 2
                    button17.isEnabled = true
                    button.isEnabled = true
                }
                if (btn17 == 17 && btn1 == 2) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button1.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn1 -= 2
                    onClickGeneral -= 2
                    button17.isEnabled = true
                    button1.isEnabled = true
                }
                if (btn17 == 17 && btn2 == 3) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn2 -= 3
                    onClickGeneral -= 2
                    button17.isEnabled = true
                    button3.isEnabled = true
                }
                if (btn17 == 17 && btn3 == 4) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn3 -= 4
                    onClickGeneral -= 2
                    button17.isEnabled = true
                    button4.isEnabled = true
                }
                if (btn17 == 17 && btn4 == 5) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn4 -= 5
                    button17.isEnabled = true
                    button6.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn5 == 6) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn5 -= 6
                    button17.isEnabled = true
                    button7.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn6 == 7) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn6 -= 7
                    onClickGeneral -= 2
                    button17.isEnabled = true
                    button8.isEnabled = true
                }
                if (btn17 == 17 && btn7 == 8) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn7 -= 8
                    onClickGeneral -= 2
                    button17.isEnabled = true
                    button9.isEnabled = true
                }
                if (btn17 == 17 && btn8 == 9) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn8 -= 9
                    button17.isEnabled = true
                    button9.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn9 == 10) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn9 -= 10
                    button17.isEnabled = true
                    button10.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn10 == 11) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn10 -= 11
                    button17.isEnabled = true
                    button11.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn11 == 12) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn11 -= 12
                    button17.isEnabled = true
                    button12.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn14 == 14) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button14.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn14 -= 14
                    onClickGeneral -= 2
                    button17.isEnabled = true
                    button14.isEnabled = true
                }
                if (btn17 == 17 && btn15 == 15) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button15.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn15 -= 15
                    button17.isEnabled = true
                    button15.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn16 == 16) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button16.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn16 -= 16
                    button17.isEnabled = true
                    button16.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn17 == 17) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button17.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn17 -= 17
                    button17.isEnabled = true
                    button17.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn18 == 18) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button18.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn18 -= 18
                    button17.isEnabled = true
                    button18.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn19 == 19) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button19.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn19 -= 19
                    button17.isEnabled = true
                    button19.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn20 == 20) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button20.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn20 -= 20
                    button17.isEnabled = true
                    button20.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn24 == 24) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button24.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn24 -= 24
                    button17.isEnabled = true
                    button24.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn22 == 22) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button22.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn22 -= 22
                    button17.isEnabled = true
                    button22.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn17 == 17 && btn23 == 23) {
                    button17.setBackgroundResource(R.drawable.signo)
                    button23.setBackgroundResource(R.drawable.signo)
                    btn17 -= 17
                    btn23 -= 23
                    button17.isEnabled = true
                    button23.isEnabled = true
                    onClickGeneral -= 2
                }

                if (btn18 == 18 && btn == 1) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn -= 1
                    button18.isEnabled = true
                    button.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn18 == 18 && btn1 == 2) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button1.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn1 -= 2
                    button18.isEnabled = true
                    button1.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn18 == 18 && btn2 == 3) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn2 -= 3
                    button18.isEnabled = true
                    button3.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn18 == 18 && btn3 == 4) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    btn13 -= 18
                    btn3 -= 4
                    button18.isEnabled = true
                    button4.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn18 == 18 && btn4 == 5) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn4 -= 5
                    button18.isEnabled = true
                    button5.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn18 == 18 && btn5 == 6) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn5 -= 6
                    button18.isEnabled = true
                    button7.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn18 == 18 && btn6 == 7) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn6 -= 7
                    button18.isEnabled = true
                    button8.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn18 == 18 && btn7 == 8) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn7 -= 8
                    button18.isEnabled = true
                    button9.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn18 == 18 && btn8 == 9) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn8 -= 9
                    button18.isEnabled = true
                    button5.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn18 == 18 && btn9 == 10) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn9 -= 10
                    button18.isEnabled = true
                    button10.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn18 == 18 && btn10 == 11) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn10 -= 11
                    button18.isEnabled = true
                    button11.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn18 == 18 && btn11 == 12) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn11 -= 12
                    onClickGeneral -= 2
                    button18.isEnabled = true
                    button12.isEnabled = true
                }
                if (btn18 == 18 && btn14 == 14) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button14.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn14 -= 14
                    onClickGeneral -= 2
                    button18.isEnabled = true
                    button14.isEnabled = true
                }
                if (btn18 == 18 && btn15 == 15) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button15.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn15 -= 15
                    onClickGeneral -= 2
                    button18.isEnabled = true
                    button15.isEnabled = true
                }
                if (btn18 == 18 && btn16 == 16) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button16.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn16 -= 16
                    onClickGeneral -= 2
                    button18.isEnabled = true
                    button16.isEnabled = true
                }
                if (btn18 == 18 && btn17 == 17) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button17.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn17 -= 17
                    onClickGeneral -= 2
                    button18.isEnabled = true
                    button17.isEnabled = true
                }
                if (btn18 == 18 && btn18 == 18) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button18.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn18 -= 18
                    onClickGeneral -= 2
                    button18.isEnabled = true
                    button18.isEnabled = true
                }
                if (btn18 == 18 && btn24 == 24) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button24.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn24 -= 24
                    onClickGeneral -= 2
                    button18.isEnabled = true
                    button24.isEnabled = true
                }
                if (btn18 == 18 && btn20 == 20) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button20.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn20 -= 20
                    onClickGeneral -= 2
                    button18.isEnabled = true
                    button20.isEnabled = true
                }
                if (btn18 == 18 && btn21 == 21) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button21.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn21 -= 21
                    onClickGeneral -= 2
                    button18.isEnabled = true
                    button21.isEnabled = true
                }
                if (btn18 == 18 && btn22 == 22) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button22.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn22 -= 22
                    button18.isEnabled = true
                    button22.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn18 == 18 && btn23 == 23) {
                    button18.setBackgroundResource(R.drawable.signo)
                    button23.setBackgroundResource(R.drawable.signo)
                    btn18 -= 18
                    btn23 -= 23
                    onClickGeneral -= 2
                    button18.isEnabled = true
                    button23.isEnabled = true
                }

                if (btn19 == 19 && btn == 1) {
                    button19.setBackgroundResource(R.drawable.signo)
                    button.setBackgroundResource(R.drawable.signo)
                    btn19 -= 19
                    btn -= 1
                    onClickGeneral -= 2
                    button19.isEnabled = true
                    button.isEnabled = true
                }
                if (btn19 == 19 && btn1 == 2) {
                    button19.setBackgroundResource(R.drawable.signo)
                    button1.setBackgroundResource(R.drawable.signo)
                    btn19 -= 19
                    btn1 -= 2
                    onClickGeneral -= 2
                    button19.isEnabled = true
                    button1.isEnabled = true
                }
                if (btn19 == 19 && btn2 == 3) {
                    button19.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    btn19 -= 19
                    btn2 -= 3
                    onClickGeneral -= 2
                    button19.isEnabled = true
                    button3.isEnabled = true
                }
                if (btn19 == 19 && btn3 == 4) {
                    button19.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    btn19 -= 19
                    btn3 -= 4
                    onClickGeneral -= 2
                    button19.isEnabled = true
                    button4.isEnabled = true
                }
                if (btn19 == 19 && btn4 == 5) {
                    button19.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    btn15 -= 19
                    btn4 -= 5
                    onClickGeneral -= 2
                    button19.isEnabled = true
                    button6.isEnabled = true
                }
                if (btn19 == 19 && btn5 == 6) {
                    button19.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    btn19 -= 19
                    btn5 -= 6
                    onClickGeneral -= 2
                    button19.isEnabled = true
                    button7.isEnabled = true
                }
                if (btn19 == 19 && btn6 == 7) {
                    button19.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    btn19 -= 19
                    btn6 -= 7
                    onClickGeneral -= 2
                    button19.isEnabled = true
                    button8.isEnabled = true
                }
                if (btn19 == 19 && btn7 == 8) {
                    button19.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn15 -= 19
                    btn7 -= 8
                    onClickGeneral -= 2
                }
                if (btn19 == 19 && btn8 == 9) {
                    button19.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    btn19 -= 19
                    btn8 -= 9
                    onClickGeneral -= 2
                    button19.isEnabled = true
                    button5.isEnabled = true
                }
                if (btn19 == 19 && btn9 == 10) {
                    button19.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    btn19 -= 19
                    btn9 -= 10
                    button19.isEnabled = true
                    button10.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn19 == 19 && btn10 == 11) {
                    button19.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    btn19 -= 19
                    btn10 -= 11
                    button19.isEnabled = true
                    button11.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn19 == 19 && btn11 == 12) {
                    button19.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    btn19 -= 19
                    btn11 -= 12
                    onClickGeneral -= 2
                    button19.isEnabled = true
                    button12.isEnabled = true
                }
                if (btn20 == 20 && btn == 1) {
                    button20.setBackgroundResource(R.drawable.signo)
                    button.setBackgroundResource(R.drawable.signo)
                    btn20 -= 20
                    btn -= 1
                    button20.isEnabled = true
                    button.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn20 == 20 && btn1 == 2) {
                    button20.setBackgroundResource(R.drawable.signo)
                    button1.setBackgroundResource(R.drawable.signo)
                    btn20 -= 20
                    btn1 -= 2
                    button20.isEnabled = true
                    button1.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn20 == 20 && btn2 == 3) {
                    button20.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    btn20 -= 20
                    btn2 -= 3
                    button20.isEnabled = true
                    button3.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn20 == 20 && btn3 == 4) {
                    button20.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    btn20 -= 20
                    btn3 -= 4
                    onClickGeneral -= 2
                    button20.isEnabled = true
                    button4.isEnabled = true
                }
                if (btn20 == 20 && btn4 == 5) {
                    button20.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    btn20 -= 20
                    btn4 -= 5
                    button20.isEnabled = true
                    button6.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn20 == 20 && btn5 == 6) {
                    button20.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    btn20 -= 20
                    btn5 -= 6
                    button20.isEnabled = true
                    button7.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn20 == 20 && btn6 == 7) {
                    button20.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    btn20 -= 20
                    btn6 -= 7
                    button20.isEnabled = true
                    button8.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn20 == 20 && btn7 == 8) {
                    button20.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn20 -= 20
                    btn7 -= 8
                    button20.isEnabled = true
                    button9.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn20 == 20 && btn8 == 9) {
                    button20.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    btn20 -= 20
                    btn8 -= 9
                    button20.isEnabled = true
                    button5.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn20 == 20 && btn9 == 10) {
                    button20.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    btn20 -= 20
                    btn9 -= 10
                    button20.isEnabled = true
                    button10.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn20 == 20 && btn10 == 11) {
                    button20.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    btn20 -= 20
                    btn10 -= 11
                    onClickGeneral -= 2
                    button20.isEnabled = true
                    button11.isEnabled = true
                }
                if (btn20 == 20 && btn11 == 12) {
                    button20.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    btn20 -= 20
                    btn11 -= 12
                    button20.isEnabled = true
                    button12.isEnabled = true
                    onClickGeneral -= 2
                }

                if (btn21 == 21 && btn == 1) {
                    button21.setBackgroundResource(R.drawable.signo)
                    button.setBackgroundResource(R.drawable.signo)
                    btn21 -= 21
                    btn -= 1
                    button21.isEnabled = true
                    button.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn21 == 21 && btn1 == 2) {
                    button21.setBackgroundResource(R.drawable.signo)
                    button1.setBackgroundResource(R.drawable.signo)
                    btn21 -= 21
                    btn1 -= 2
                    button21.isEnabled = true
                    button1.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn21 == 21 && btn2 == 3) {
                    button21.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    btn21 -= 21
                    btn2 -= 3
                    button21.isEnabled = true
                    button3.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn21 == 21 && btn3 == 4) {
                    button21.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    btn21 -= 21
                    btn3 -= 4
                    button21.isEnabled = true
                    button4.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn21 == 21 && btn4 == 5) {
                    button21.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    btn21 -= 21
                    btn4 -= 5
                    button21.isEnabled = true
                    button6.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn21 == 21 && btn5 == 6) {
                    button21.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    btn21 -= 21
                    btn5 -= 6
                    button21.isEnabled = true
                    button7.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn21 == 21 && btn6 == 7) {
                    button21.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    btn21 -= 21
                    btn6 -= 7
                    button21.isEnabled = true
                    button8.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn21 == 21 && btn7 == 8) {
                    button21.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn21 -= 21
                    btn7 -= 8
                    button21.isEnabled = true
                    button9.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn21 == 21 && btn8 == 9) {
                    button21.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    btn21 -= 21
                    btn8 -= 9
                    button21.isEnabled = true
                    button5.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn21 == 21 && btn9 == 10) {
                    button21.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    btn21 -= 21
                    btn9 -= 10
                    button21.isEnabled = true
                    button10.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn21 == 21 && btn10 == 11) {
                    button21.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    btn21 -= 21
                    btn10 -= 11
                    button21.isEnabled = true
                    button11.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn21 == 21 && btn11 == 12) {
                    button21.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    btn21 -= 21
                    btn1 -= 12
                    button21.isEnabled = true
                    button12.isEnabled = true
                    onClickGeneral -= 2
                }

                if (btn22 == 22 && btn == 1) {
                    button22.setBackgroundResource(R.drawable.signo)
                    button.setBackgroundResource(R.drawable.signo)
                    btn22 -= 22
                    btn -= 1
                    button22.isEnabled = true
                    button.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn22 == 22 && btn1 == 2) {
                    button22.setBackgroundResource(R.drawable.signo)
                    button1.setBackgroundResource(R.drawable.signo)
                    btn22 -= 22
                    btn1 -= 2
                    button22.isEnabled = true
                    button1.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn22 == 22 && btn2 == 3) {
                    button22.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    btn22 -= 22
                    btn2 -= 3
                    button22.isEnabled = true
                    button3.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn22 == 22 && btn3 == 4) {
                    button22.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    btn22 -= 22
                    btn3 -= 4
                    button22.isEnabled = true
                    button4.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn22 == 22 && btn4 == 5) {
                    button22.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    btn22 -= 22
                    btn4 -= 5
                    button22.isEnabled = true
                    button6.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn22 == 22 && btn5 == 6) {
                    button22.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    btn22 -= 22
                    btn5 -= 6
                    button22.isEnabled = true
                    button7.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn22 == 22 && btn6 == 7) {
                    button22.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    btn22 -= 22
                    btn6 -= 7
                    button22.isEnabled = true
                    button8.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn22 == 22 && btn7 == 8) {
                    button22.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn22 -= 22
                    btn7 -= 8
                    button22.isEnabled = true
                    button9.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn22 == 22 && btn8 == 9) {
                    button22.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    btn22 -= 22
                    btn8 -= 9
                    button22.isEnabled = true
                    button5.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn22 == 22 && btn9 == 10) {
                    button22.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    btn22 -= 22
                    btn9 -= 10
                    button22.isEnabled = true
                    button10.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn22 == 22 && btn10 == 11) {
                    button22.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    btn22 -= 22
                    btn10 -= 11
                    button22.isEnabled = true
                    button11.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn22 == 22 && btn11 == 12) {
                    button22.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    btn22 -= 22
                    btn11 -= 12
                    button22.isEnabled = true
                    button12.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn23 == 23 && btn == 1) {
                    button23.setBackgroundResource(R.drawable.signo)
                    button.setBackgroundResource(R.drawable.signo)
                    btn23 -= 23
                    btn -= 1
                    button23.isEnabled = true
                    button.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn23 == 23 && btn1 == 2) {
                    button23.setBackgroundResource(R.drawable.signo)
                    button1.setBackgroundResource(R.drawable.signo)
                    btn23 -= 23
                    btn1 -= 2
                    button23.isEnabled = true
                    button1.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn23 == 23 && btn2 == 3) {
                    button23.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    btn23 -= 23
                    btn2 -= 3
                    button23.isEnabled = true
                    button3.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn23 == 23 && btn3 == 4) {
                    button23.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    btn23 -= 23
                    btn3 -= 4
                    button23.isEnabled = true
                    button4.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn23 == 23 && btn4 == 5) {
                    button23.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    btn23 -= 23
                    btn4 -= 5
                    button23.isEnabled = true
                    button6.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn23 == 23 && btn5 == 6) {
                    button23.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    btn23 -= 23
                    btn5 -= 6
                    button23.isEnabled = true
                    button7.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn23 == 23 && btn6 == 7) {
                    button23.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    btn23 -= 23
                    btn6 -= 7
                    button23.isEnabled = true
                    button8.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn23 == 23 && btn7 == 8) {
                    button23.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn23 -= 23
                    btn7 -= 8
                    button23.isEnabled = true
                    button9.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn23 == 23 && btn8 == 9) {
                    button23.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    btn23 -= 23
                    btn8 -= 9
                    button23.isEnabled = true
                    button5.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn23 == 23 && btn9 == 10) {
                    button23.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    btn23 -= 23
                    btn9 -= 10
                    button23.isEnabled = true
                    button10.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn24 == 23 && btn10 == 11) {
                    button23.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    btn23 -= 23
                    btn10 -= 11
                    button23.isEnabled = true
                    button11.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn23 == 23 && btn11 == 12) {
                    button23.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    btn23 -= 23
                    btn11 -= 12
                    button23.isEnabled = true
                    button12.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn24 == 24 && btn == 1) {
                    button24.setBackgroundResource(R.drawable.signo)
                    button.setBackgroundResource(R.drawable.signo)
                    btn24 -= 24
                    btn -= 1
                    button24.isEnabled = true
                    button.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn24 == 24 && btn1 == 2) {
                    button24.setBackgroundResource(R.drawable.signo)
                    button1.setBackgroundResource(R.drawable.signo)
                    btn24 -= 24
                    btn1 -= 2
                    button24.isEnabled = true
                    button1.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn24 == 24 && btn2 == 3) {
                    button24.setBackgroundResource(R.drawable.signo)
                    button3.setBackgroundResource(R.drawable.signo)
                    btn24 -= 24
                    btn2 -= 3
                    button24.isEnabled = true
                    button3.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn24 == 24 && btn3 == 4) {
                    button24.setBackgroundResource(R.drawable.signo)
                    button4.setBackgroundResource(R.drawable.signo)
                    btn24 -= 24
                    btn3 -= 4
                    button24.isEnabled = true
                    button4.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn24 == 24 && btn4 == 5) {
                    button24.setBackgroundResource(R.drawable.signo)
                    button6.setBackgroundResource(R.drawable.signo)
                    btn24 -= 24
                    btn4 -= 5
                    button24.isEnabled = true
                    button6.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn24 == 24 && btn5 == 6) {
                    button24.setBackgroundResource(R.drawable.signo)
                    button7.setBackgroundResource(R.drawable.signo)
                    btn24 -= 24
                    btn5 -= 6
                    button24.isEnabled = true
                    button7.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn24 == 24 && btn6 == 7) {
                    button24.setBackgroundResource(R.drawable.signo)
                    button8.setBackgroundResource(R.drawable.signo)
                    btn24 -= 24
                    btn6 -= 7
                    button24.isEnabled = true
                    button8.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn24 == 24 && btn7 == 8) {
                    button24.setBackgroundResource(R.drawable.signo)
                    button9.setBackgroundResource(R.drawable.signo)
                    btn24 -= 24
                    btn7 -= 8
                    button24.isEnabled = true
                    button9.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn24 == 24 && btn8 == 9) {
                    button24.setBackgroundResource(R.drawable.signo)
                    button5.setBackgroundResource(R.drawable.signo)
                    btn24 -= 24
                    btn8 -= 9
                    button24.isEnabled = true
                    button5.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn24 == 24 && btn9 == 10) {
                    button24.setBackgroundResource(R.drawable.signo)
                    button10.setBackgroundResource(R.drawable.signo)
                    btn24 -= 24
                    btn9 -= 10
                    button24.isEnabled = true
                    button10.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn24 == 24 && btn10 == 11) {
                    button24.setBackgroundResource(R.drawable.signo)
                    button11.setBackgroundResource(R.drawable.signo)
                    btn24 -= 24
                    btn10 -= 11
                    button24.isEnabled = true
                    button11.isEnabled = true
                    onClickGeneral -= 2
                }
                if (btn24 == 24 && btn11 == 12) {
                    button24.setBackgroundResource(R.drawable.signo)
                    button12.setBackgroundResource(R.drawable.signo)
                    btn24 -= 24
                    btn11 -= 12
                    button24.isEnabled = true
                    button12.isEnabled = true
                    onClickGeneral -= 2
                }
            }
        }
    }

}

