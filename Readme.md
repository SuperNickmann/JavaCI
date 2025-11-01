Github verwendet

Aufbau Pipeline:
1. Kompilieren der Java-Dateien
2. Ausführen der Tests (Main.java prüft die add-Methode)
3. Anzeige, ob der Build erfolgreich ist oder fehlschlägt

Push verhalten: 
Jeder Push auf main löst die Pipeline automatisch aus
Die CI prüft den Code, kompiliert ihn und führt Tests aus
Fehlerhafte Tests sorgen dafür, dass der Build fehlschlägt