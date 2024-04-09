package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnCancel)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnGenerate.setOnClickListener {
            val age = ageNumber.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 0..20 -> "C"
                    in 21..25 -> "D"
                    in 26..30 -> "E"
                    in 31..40 -> "F"
                    in 41..50 -> "G"
                    in 51..60 ->"H"
                    in 61..70-> "I"
                    in 71..80 -> "J"
                    in 81..85  -> "K"
                    in 86..95 -> "L"
                    in 96..100 -> "M"
                    else -> "The age is out of range"
                }
                txtResult.text = "Age: $age\n${
                    when (result) {
                        "C" -> "The no historical figure to be around this age."
                        "D" -> "You are the same age group as Tupac Shakur, he died at the age " + 
                                " of 25. Tupac Shakur was a rapper, actor, activist, poet, " +
                                "and revolutionary."
                        "E" -> "You are the same age group as Steve Biko, he died at the age of " +
                                " 30. Steve Biko was an anti-apartheid activist in South Africa" +
                                "in the 1960s and 1970s. A student leader, he later founded the" +
                                "Black Consciousness Movement which would empower and mobilize" +
                                "much of the urban black population."
                        "F" -> "You are the same age group as Brenda Fassie, she died at the age "+
                                "of 39. Brenda Fassie was a South African singer, songwriter, " +
                                "dancer and activist. Affectionately called MaBrrr by fans, she " +
                                "is also known as the Queen of African Pop, the Madonna of " +
                                " The Townships or as The Black Madonna."
                        "G" -> "You are the same age group Shaka Zulu, he died at the age of 41." +
                                " Shaka Zulu was the founder of what would become known as the " +
                                "Zulu nation. He ruled from 1817 until he was assassinated by his" +
                                "half-brothers in 1828."
                        "H" -> "You are the same age group as Jacob Matlala (Baby Jake). He died " +
                                "at the age of 51. Jacob Matlala was a South African boxer and" +
                                " junior flyweight champion. He won 4 world championship titles." +
                                " In 2004, Matlala was voted #72 in the 100 Greatest" +
                                " South Africans a poll organized by SABC."
                        "I" -> "You are the same age group as Albert Luthuli. He died at the age" +
                                " of 69. Albert Luthuli was a South African anti-aparthied" +
                                " activist, traditional leader, and politician who served as the" +
                                " President-General of the African National Congress from 1952" +
                                " until his death in 1967."
                        "J" ->  "You are the same age group as Oliver Tambo. He died at the age" +
                                " of 75. Oliver Tambo was a South African anti-aparthied" +
                                " politician and activist who served as President of the African" +
                                " National Congress (ANC) from 1967 to 1991."
                        "K" ->  "You are the same age group as Winnie Madikizela-Mandela. She" +
                                " died at the age of 81. Winnie Madikizela-Mandela was a South" +
                                " African anti-apartheid activist and politician, and the second" +
                                " wife of Nelson Mandela. She served as a member of parliament" +
                                " from 1994 to 2003, and from 2009 until her death, and was a" +
                                " deputy minister of arts and culture " +
                                " from 1994 to 1996."
                        "L" ->  "You are the same age group as Mangosuthu Buthelezi. He died at" +
                                " the age of 95. Mangosuthu Buthelezi was a South African" +
                                " politician and Zulu price who served as the traditional prime" +
                                " minister to the Zulu royal family from 1954 until his death" +
                                " in 2023. Buthelezi was a chief" + 
                                " minister of the KwaZulu bantustan during apartheid and founded" +
                                " Inkatha Freedom Party (IFP) in 1975, leading it until 2019, and" +
                                " became its president emeritus soon after that."
                        "M" ->  "You are the same age group as Harry Belafonte. He died at the" +
                                " age of 96. Harry Belafonte was an American singer, actor, and" +
                                " civil rights activist who popularized calypso music with" +
                                " international audiences in the 1950s and 1960s. Belafonte's" +
                                " career breakthrough album Calypso (1956) was the first" +
                                " million-selling LP by a single artist."
                        else -> "You are out of age range."
                    }
                }"
            } else {
                txtResult.text = "Please enter a valid age."
            }
        }

        btnCancel.setOnClickListener {
            ageNumber.text.clear()
            txtResult.text = ""
        }
    }





    }