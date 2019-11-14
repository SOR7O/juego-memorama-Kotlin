package com.example.juego

import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*
//import kotlin.random.Random
import kotlin.random.Random as Random
import java.util.*
import java.util.concurrent.ThreadLocalRandom
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        this.click()


    }


    private fun click() {
        var button: Button? = null
        var button1: Button? = null
        var button2: Button? = null
        var button3: Button? = null
        var button4: Button? = null
        var button5: Button? = null
        var button6: Button? = null
        var button7: Button? = null
        var button8: Button? = null
        var button9: Button? = null
        var button10: Button? = null
        var button11: Button? = null
        var button12: Button? = null


        var onClickGeneral = 0

        button = findViewById<Button>(R.id.button)
        button1 = findViewById<Button>(R.id.button1)
        button2 = findViewById<Button>(R.id.button3)//Boton de comprobar si son iguales o no
        button3 = findViewById<Button>(R.id.button2)
        button4 = findViewById<Button>(R.id.button4)
        button5 = findViewById<Button>(R.id.button5)
        button6 = findViewById<Button>(R.id.button6)
        button7 = findViewById<Button>(R.id.button7)
        button8 = findViewById<Button>(R.id.button8)
        button9 = findViewById<Button>(R.id.button9)
        button10 = findViewById<Button>(R.id.button10)
        button11 = findViewById<Button>(R.id.button11)
        button12 = findViewById<Button>(R.id.button12)


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


        var imageArray = arrayOf(
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
            R.drawable.messi
        )

        val n = List(7){Random.nextInt(0,12)}
        val n1 = List(12){Random.nextInt(0,12)}

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




        button.setOnClickListener {
            if (onClickGeneral < 2) {
                button.setBackgroundResource(imageArray[n[0]])
                onClickGeneral++
                btn+= 1
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT).show()
            }
        }
        button1.setOnClickListener {
            if (onClickGeneral < 2) {
                btn1 += 2
                button1.setBackgroundResource(imageArray[n[2]])
                onClickGeneral++
                Toast.makeText(this, "$n1 B", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
            //Toast.makeText(this, "$benzemaB B", Toast.LENGTH_SHORT).show()
        }
        button3.setOnClickListener {
            if (onClickGeneral < 2) {
                btn2 += 3
                button3.setBackgroundResource(imageArray[n[5]])
                onClickGeneral++
                Toast.makeText(this, "$n C", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
            //Toast.makeText(this, "$rodrygoA A", Toast.LENGTH_SHORT).show()
        }
        button4.setOnClickListener {
            if (onClickGeneral < 2) {
                btn3 += 4
                button4.setBackgroundResource(imageArray[n[4]])
                onClickGeneral++
                Toast.makeText(this, "$n D", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
            //Toast.makeText(this, "$rodrigoB B", Toast.LENGTH_SHORT).show()
        }
        button6.setOnClickListener {
            if (onClickGeneral < 2) {
                btn4 += 5
                button6.setBackgroundResource(imageArray[n[1]])
                onClickGeneral++
                Toast.makeText(this, "$n D", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
            //Toast.makeText(this, "$rodrigoB B", Toast.LENGTH_SHORT).show()
        }
        button7.setOnClickListener {
            if (onClickGeneral < 2) {
                btn5 += 6
                button7.setBackgroundResource(imageArray[n[3]])
                onClickGeneral++
                Toast.makeText(this, "$onClickGeneral D", Toast.LENGTH_SHORT).show()
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
            } else {
                Toast.makeText(this, "Ya haz seleccionado dos cartas", Toast.LENGTH_SHORT)
                    .show()
            }
        }


        button2.setOnClickListener {
            if (btn == 1 && btn8 == 9) {
                button.isEnabled = false
                button5.isEnabled = false
                onClickGeneral -= 2
                btn1-=1
                btn8-=9
            }
            if (btn1 == 2 && btn7 == 8) {
                button1.isEnabled = false
                button9.isEnabled = false
                onClickGeneral -= 2
                btn1-=2
                btn7-=8
            }
            if (btn2 == 3 && btn9 == 10) {
                button3.isEnabled = false
                button10.isEnabled = false
                onClickGeneral -= 2
                btn2-=3
                btn9-=10
            }
            if (btn3 == 4 && btn10 == 11) {
                button4.isEnabled = false
                button11.isEnabled = false
                onClickGeneral -= 2
                btn3-=4
                btn10-=11
            }
            if (btn4 == 5 && btn6 == 7) {
                button6.isEnabled = false
                button8.isEnabled = false
                onClickGeneral -= 2
                btn4-=5
                btn6-=7
            }
            if (btn5 == 6 && btn11 == 12) {
                button7.isEnabled = false
                button12.isEnabled = false
                onClickGeneral -= 2
                btn5-=6
                btn11-=12
            }

            if(btn==1 && btn1==2){
                button.setBackgroundResource(R.drawable.signo)
                button1.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn-=1
                btn1-=2
            }
            if(btn==1 && btn2==3){
                button.setBackgroundResource(R.drawable.signo)
                button3.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn-=1
                btn2-=3
            }
            if(btn==1 && btn3==4){
                button.setBackgroundResource(R.drawable.signo)
                button4.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn-=1
                btn3-=4
            }
            if(btn==1 && btn4==5){
                button.setBackgroundResource(R.drawable.signo)
                button6.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn-=1
                btn4-=5
            }
            if(btn==1 && btn5==6){
                button.setBackgroundResource(R.drawable.signo)
                button7.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn-=1
                btn5-=6
            }
            if(btn==1 && btn6==7){
                button.setBackgroundResource(R.drawable.signo)
                button8.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn-=1
                btn6-=7
            }
            if(btn==1 && btn7==8){
                button.setBackgroundResource(R.drawable.signo)
                button9.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn-=1
                btn7-=8
            }
            if(btn==1 && btn8==9){
                button.setBackgroundResource(R.drawable.signo)
                button5.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn-=1
                btn8-=9
            }
            if(btn==1 && btn9==10){
                button.setBackgroundResource(R.drawable.signo)
                button10.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn-=1
                btn9-=10
            }
            if(btn==1 && btn10==11){
                button.setBackgroundResource(R.drawable.signo)
                button11.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn-=1
                btn10-=11
            }
            if(btn==1 && btn11==12){
                button.setBackgroundResource(R.drawable.signo)
                button12.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn-=1
                btn11-=12
            }


            if(btn1==2 && btn2==3){
                button1.setBackgroundResource(R.drawable.signo)
                button3.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn1-=2
                btn2-=3
            }
            if(btn1==2 && btn3==4){
                button1.setBackgroundResource(R.drawable.signo)
                button4.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn1-=2
                btn3-=4
            }
            if(btn1==2 && btn4==5){
                button1.setBackgroundResource(R.drawable.signo)
                button6.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn1-=2
                btn4-=5
            }
            if(btn1==2 && btn5==6){
                button1.setBackgroundResource(R.drawable.signo)
                button7.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn1-=2
                btn5-=6
            }
            if(btn1==2 && btn6==7){
                button1.setBackgroundResource(R.drawable.signo)
                button8.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn1-=2
                btn6-=7
            }
            if(btn1==2 && btn8==9){
                button1.setBackgroundResource(R.drawable.signo)
                button5.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn1-=2
                btn8-=9
            }
            if(btn1==2 && btn9==10){
                button1.setBackgroundResource(R.drawable.signo)
                button10.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn1-=2
                btn9-=10
            }
            if(btn1==2 && btn10==11){
                button1.setBackgroundResource(R.drawable.signo)
                button11.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn1-=2
                btn10-=11
            }
            if(btn1==2 && btn11==12){
                button1.setBackgroundResource(R.drawable.signo)
                button12.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn1-=2
                btn11-=12
            }


            if(btn2==3 && btn3==4){
                button3.setBackgroundResource(R.drawable.signo)
                button4.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn2-=3
                btn3-=4
            }
            if(btn2==3&& btn4==5){
                button3.setBackgroundResource(R.drawable.signo)
                button6.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn2-=3
                btn4-=5
            }
            if(btn2==3 && btn5==6){
                button3.setBackgroundResource(R.drawable.signo)
                button7.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn2-=3
                btn5-=6
            }
            if(btn2==3 && btn6==7){
                button3.setBackgroundResource(R.drawable.signo)
                button8.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn2-=3
                btn6-=7
            }
            if(btn2==3 && btn8==9){
                button3.setBackgroundResource(R.drawable.signo)
                button5.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn2-=3
                btn8-=9
            }
            if(btn2==3 && btn10==11){
                button3.setBackgroundResource(R.drawable.signo)
                button11.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn2-=3
                btn10-=11
            }
            if(btn2==3 && btn11==12){
                button3.setBackgroundResource(R.drawable.signo)
                button12.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn2-=3
                btn11-=12
            }


            if(btn3==4 && btn4==5){
                button4.setBackgroundResource(R.drawable.signo)
                button6.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn3-=4
                btn4-=5
            }
            if(btn3==4  && btn5==6){
                button4.setBackgroundResource(R.drawable.signo)
                button7.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn3-=4
                btn5-=6
            }
            if(btn3==4  && btn6==7){
                button4.setBackgroundResource(R.drawable.signo)
                button8.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn3-=4
                btn6-=7
            }
            if(btn3==4  && btn7==8){
                button4.setBackgroundResource(R.drawable.signo)
                button9.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn3-=4
                btn7-=8
            }
            if(btn3==4  && btn8==9){
                button4.setBackgroundResource(R.drawable.signo)
                button5.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn3-=4
                btn8-=9
            }
            if(btn3==4  && btn11==12){
                button4.setBackgroundResource(R.drawable.signo)
                button12.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn3-=4
                btn11-=12
            }


            if(btn4==5  && btn5==6){
                button6.setBackgroundResource(R.drawable.signo)
                button7.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn4-=5
                btn5-=6
            }
            if(btn4==5  && btn8==9){
                button6.setBackgroundResource(R.drawable.signo)
                button5.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn4-=5
                btn8-=9
            }
            if(btn4==5  && btn11==12){
                button6.setBackgroundResource(R.drawable.signo)
                button12.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn4-=5
                btn11-=12
            }

            if(btn5==6  && btn8==9){
                button7.setBackgroundResource(R.drawable.signo)
                button5.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn5-=6
                btn8-=9
            }
            if(btn9==10 && btn7==8){
                button9.setBackgroundResource(R.drawable.signo)
                button10.setBackgroundResource(R.drawable.signo)
                onClickGeneral -= 2
                btn9-=10
                btn7-=8
            }
            if(btn7==8 && btn8==9){
                button5.setBackgroundResource(R.drawable.signo)
                button9.setBackgroundResource(R.drawable.signo)
                btn7-=8
                btn8-=9
                onClickGeneral-=2
            }
            if(btn7==8 && btn10==11){
                button11.setBackgroundResource(R.drawable.signo)
                button9.setBackgroundResource(R.drawable.signo)
                btn7-=8
                btn10-=11
                onClickGeneral-=2
            }
            if(btn7==8 && btn11==12){
                button12.setBackgroundResource(R.drawable.signo)
                button9.setBackgroundResource(R.drawable.signo)
                btn7-=8
                btn11-=12
                onClickGeneral-=2
            }

            if(btn7==8 && btn2==3){
                button3.setBackgroundResource(R.drawable.signo)
                button9.setBackgroundResource(R.drawable.signo)
                btn7-=8
                btn2-=3
                onClickGeneral-=2
            }
            if(btn7==8 && btn4==5){
                button6.setBackgroundResource(R.drawable.signo)
                button9.setBackgroundResource(R.drawable.signo)
                btn7-=8
                btn4-=5
                onClickGeneral-=2
            }
            if(btn7==8 && btn6==7){
                button8.setBackgroundResource(R.drawable.signo)
                button9.setBackgroundResource(R.drawable.signo)
                btn7-=8
                btn6-=7
                onClickGeneral-=2
            }
            if(btn9==10 && btn5==6){
                button7.setBackgroundResource(R.drawable.signo)
                button10.setBackgroundResource(R.drawable.signo)
                btn9-=10
                btn5-=6
                onClickGeneral-=2
            }
            if(btn6==7 && btn5==6){
                button8.setBackgroundResource(R.drawable.signo)
                button7.setBackgroundResource(R.drawable.signo)
                btn6-=7
                btn5-=6
                onClickGeneral-=2
            }
            if(btn8==9 && btn9==10){
                button10.setBackgroundResource(R.drawable.signo)
                button5.setBackgroundResource(R.drawable.signo)
                btn8-=9
                btn9-=10
                onClickGeneral-=2
            }



        }
    }

}
