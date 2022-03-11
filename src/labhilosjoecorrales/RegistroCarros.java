package labhilosjoecorrales;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RegistroCarros {
    static  RandomAccessFile autos;
    static RandomAccessFile codigos;

    public RegistroCarros() throws FileNotFoundException, IOException {
        File file = new File("CarpetaAutos");
        file.mkdir();
        
        RegistroCarros.codigos = new RandomAccessFile("CarpetaAutos/codigos.corr", "rw");
        RegistroCarros.autos = new RandomAccessFile("CarpetaAutos/autos.corr", "rw");
        
        iniciarCodigo();
    }
    
    private static void iniciarCodigo() throws IOException {
        if(codigos.length() == 0) {
            codigos.writeInt(1);
        }
    }
    
    private static int getCodigo() throws IOException {
        codigos.seek(0);
        int code = codigos.readInt();
        codigos.seek(0);
        codigos.writeInt(code+1);
        return code;
    }
    
    public static void agregarCorredor(String tipoCarro, String nombreCorredor, int RGB) throws IOException {
        autos.seek(autos.length());
        int codigo = getCodigo();
        autos.writeInt(codigo); // numero identificador // 4
        autos.writeLong(0); // distancia recorrida //8
        autos.writeUTF(nombreCorredor); //nombre del corredor //indefinido
        autos.writeInt(RGB); // El rgb del color //4
        autos.writeUTF(tipoCarro); //tipo de carro //indefinido
    }
}
