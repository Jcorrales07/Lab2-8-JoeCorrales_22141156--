package labhilosjoecorrales;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RegistroCarros {
    RandomAccessFile autos, codigos;

    public RegistroCarros() throws FileNotFoundException, IOException {
        File file = new File("CarpetaAutos");
        file.mkdir();
        
        this.codigos = new RandomAccessFile("CarpetaAutos/codigos.corr", "rw");
        this.autos = new RandomAccessFile("CarpetaAutos/autos.corr", "rw");
        initCodes();
    }
    
    private void initCodes() throws IOException {
        if(codigos.length() == 0) {
            codigos.writeInt(1);
        }
    }
    
    private int getCode() throws IOException {
        codigos.seek(0);
        int code = codigos.readInt();
        codigos.seek(0);
        codigos.writeInt(code+1);
        return code;
    }
    
    public void agregarCorredor(String tipoCarro, String nombreCorredor, int RGB) throws IOException {
        autos.seek(autos.length());
        int code = getCode();
        autos.writeInt(code); // numero identificador
        autos.writeUTF(tipoCarro); //tipo de carro
        autos.writeUTF(nombreCorredor); //nombre del corredor
        //Parte para registrar el color
        autos.writeInt(RGB); // El rgb del color
    }
    
}
