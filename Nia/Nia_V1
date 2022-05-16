import pyttsx3 
import speech_recognition as sr
import mysql.connector
from difflib import SequenceMatcher as SMS
import random
import time

recognizer = sr.Recognizer()

microphone = sr.Microphone(device_index=0)

eng = pyttsx3.init()

#configuracion de la velocidad de pronunciacion
eng.setProperty("rate",140)

# nivel de volumen de voz
eng.setProperty("volume",1.0)

#voz a utilizar 
listVoices= eng.getProperty("voices")
eng.setProperty("voice",listVoices[0].id)

eng.say("hola kiru, soy Nia 0.1")
eng.say("por ahora todo parece estar en orden")
eng.runAndWait()