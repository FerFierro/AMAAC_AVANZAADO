package com.enterprises.devare.amaac_avanzaado.modelo.db;

import android.content.Context;

import com.enterprises.devare.amaac_avanzaado.R;
import com.enterprises.devare.amaac_avanzaado.modelo.Nivel;
import com.enterprises.devare.amaac_avanzaado.modelo.Pictograma;

import static com.enterprises.devare.amaac_avanzaado.modelo.Nivel.VISTA_NORMAL;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_ALIMENTOS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_ANIMALES;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_ANIMO;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_BEBIDAS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_BISILABAS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_BISILABAS_ANIMALES;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_BISILABAS_BEBIDAS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_BISILABAS_COMIDA;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_COMIDA;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_B;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_C;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_D;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_F;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_G;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_H;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_J;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_K;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_L;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_M;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_N;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_P;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_Q;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_R;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_S;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_T;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_V;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_W;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_X;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_Y;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES_Z;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_FAMILIA;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_FRUTAS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_LUGARES;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_MONOSILABAS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_MONOSILABAS_ANIMALES;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_MONOSILABAS_BEBIDAS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_MONOSILABAS_COMIDA;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_MONOSILABAS_FAMILIA;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_MONOSILABAS_OBJETOS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_MONOSILABAS_RESPUESTAS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_MONOSILABAS_VERBOS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_OBJETOS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_POLISILABAS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_POLISILABAS_BEBIDAS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_POLISILABAS_FRUTAS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_POSTRES;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_PROFESIONES;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_RESPUESTAS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VERBOS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VERBOS_AUX;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VERDURAS;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VOCALES;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VOCAL_A;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_CONSONANTES;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VOCAL_E;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VOCAL_I;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VOCAL_O;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.CAT_VOCAL_U;
import static com.enterprises.devare.amaac_avanzaado.modelo.Pictograma.TIPO_PIC_NORMAL;

public class DataManager {


    //<editor-fold desc="MÉTODO inicializar_pictogramas() SE ENVIAN LOS DATOS A LA BASE DE DATOS">
    public void inicializar_pictogramas(Context cn) {

        DBHelper dbHandler = new DBHelper(cn);
        System.out.println("*******************************************************************************");
        System.out.println("Entre a Init_pictogramas");

        //============ VERBOS AUXILIARES
        dbHandler.insertPictograma(new Pictograma( TIPO_PIC_NORMAL, CAT_VERBOS_AUX, "Estoy",            R.drawable.ic_tablero_verbos_aux_estar     ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma( TIPO_PIC_NORMAL, CAT_VERBOS_AUX, "Necesito",         R.drawable.ic_tablero_verbos_aux_necesitar ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma( TIPO_PIC_NORMAL, CAT_VERBOS_AUX, "Puedo",            R.drawable.ic_tablero_verbos_aux_poder     ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma( TIPO_PIC_NORMAL, CAT_VERBOS_AUX, "Quiero",           R.drawable.ic_tablero_verbos_aux_querer    ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma( TIPO_PIC_NORMAL, CAT_VERBOS_AUX, "Saber",            R.drawable.ic_tablero_verbos_aux_saber     ,0,1,1,0));

        //============ RESPUESTAS
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_RESPUESTAS, "Bien",            R.drawable.ic_tablero_respuestas_bien        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_RESPUESTAS, "Mal",             R.drawable.ic_tablero_respuestas_mal         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_RESPUESTAS, "No entiendo",     R.drawable.ic_tablero_respuestas_no_entiendo ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_RESPUESTAS, "Sí",              R.drawable.ic_tablero_respuestas_si          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_RESPUESTAS, "No",              R.drawable.ic_tablero_respuestas_no          ,0,1,1,0));

        //============ VERBOS
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Arreglar",           R.drawable.ic_tablero_verbos_arreglar       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Ayudar",             R.drawable.ic_tablero_verbos_ayudar         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Bailar",             R.drawable.ic_tablero_verbos_bailar         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Bajar",              R.drawable.ic_tablero_verbos_bajar          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Beber",              R.drawable.ic_tablero_verbos_beber          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Buscar",             R.drawable.ic_tablero_verbos_buscar         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Caminar",            R.drawable.ic_tablero_verbos_caminar        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Cantar",             R.drawable.ic_tablero_verbos_cantar         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Celebrar",           R.drawable.ic_tablero_verbos_celebrar       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Cocinar",            R.drawable.ic_tablero_verbos_cocinar        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Compartir",          R.drawable.ic_tablero_verbos_compartir      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Comprar",            R.drawable.ic_tablero_verbos_comprar        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Correr",             R.drawable.ic_tablero_verbos_correr         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Crear",              R.drawable.ic_tablero_verbos_crear          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Dar",                R.drawable.ic_tablero_verbos_dar            ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Despertarse",        R.drawable.ic_tablero_verbos_despertarse    ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Dormir",             R.drawable.ic_tablero_verbos_dormir         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Entrar",             R.drawable.ic_tablero_verbos_entrar         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Escribir",           R.drawable.ic_tablero_verbos_escribir       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Escuchar",           R.drawable.ic_tablero_verbos_escuchar       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Estudiar",           R.drawable.ic_tablero_verbos_estudiar       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Ganar",              R.drawable.ic_tablero_verbos_ganar          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Girar",              R.drawable.ic_tablero_verbos_girar          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Guardar",            R.drawable.ic_tablero_verbos_guardar        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Hablar",             R.drawable.ic_tablero_verbos_hablar         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Hacer",              R.drawable.ic_tablero_verbos_hacer          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Herir",              R.drawable.ic_tablero_verbos_herir          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Huir",               R.drawable.ic_tablero_verbos_huir           ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Ir",                 R.drawable.ic_tablero_verbos_ir             ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Leer",               R.drawable.ic_tablero_verbos_leer           ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Llamar",             R.drawable.ic_tablero_verbos_llamar         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Mojar",              R.drawable.ic_tablero_verbos_mojar          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Nadar",              R.drawable.ic_tablero_verbos_nadar          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Perder",             R.drawable.ic_tablero_verbos_perder         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Poner",              R.drawable.ic_tablero_verbos_poner          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Probar",             R.drawable.ic_tablero_verbos_probar         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Regalar",            R.drawable.ic_tablero_verbos_regalar        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Salir",              R.drawable.ic_tablero_verbos_salir          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Saltar",             R.drawable.ic_tablero_verbos_saltar         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Secar",              R.drawable.ic_tablero_verbos_secar          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Sentarse",           R.drawable.ic_tablero_verbos_sentarse       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Ser",                R.drawable.ic_tablero_verbos_ser            ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Subir",              R.drawable.ic_tablero_verbos_subir          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Tener",              R.drawable.ic_tablero_verbos_tener          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Trabajar",           R.drawable.ic_tablero_verbos_trabajar       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Usar",               R.drawable.ic_tablero_verbos_usar           ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Venir",              R.drawable.ic_tablero_verbos_venir          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Ver",                R.drawable.ic_tablero_verbos_ver            ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Vestirse",           R.drawable.ic_tablero_verbos_vestirse       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERBOS,  "Volar",              R.drawable.ic_tablero_verbos_volar          ,0,1,1,0));

        //============ BEBIDAS
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_BEBIDAS,  "Agua",              R.drawable.ic_tablero_alimentos_bebidas_agua        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_BEBIDAS,  "Jugo",              R.drawable.ic_tablero_alimentos_bebidas_jugo        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_BEBIDAS,  "Leche",             R.drawable.ic_tablero_alimentos_bebidas_leche       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_BEBIDAS,  "Refresco",          R.drawable.ic_tablero_alimentos_bebidas_refresco    ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_BEBIDAS,  "Te",                R.drawable.ic_tablero_alimentos_bebidas_te          ,0,1,1,0));

        //============ FRUTAS
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Cerezas",            R.drawable.ic_tablero_alimentos_frutas_cereza       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Durazno",            R.drawable.ic_tablero_alimentos_frutas_durazno      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Fresa",              R.drawable.ic_tablero_alimentos_frutas_fresa        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Limón",              R.drawable.ic_tablero_alimentos_frutas_limon        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Mango",              R.drawable.ic_tablero_alimentos_frutas_mango        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Manzana",            R.drawable.ic_tablero_alimentos_frutas_manzana      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Melón",              R.drawable.ic_tablero_alimentos_frutas_melon        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Naranja",            R.drawable.ic_tablero_alimentos_frutas_naranja      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Papaya",             R.drawable.ic_tablero_alimentos_frutas_papaya       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Pera",               R.drawable.ic_tablero_alimentos_frutas_pera         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Piña",               R.drawable.ic_tablero_alimentos_frutas_pina         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Platano",            R.drawable.ic_tablero_alimentos_frutas_platano      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Sandia",             R.drawable.ic_tablero_alimentos_frutas_sandia       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Toronja",            R.drawable.ic_tablero_alimentos_frutas_toronja      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FRUTAS,  "Uvas",               R.drawable.ic_tablero_alimentos_frutas_uvas         ,0,1,1,0));

        //============ VERDURAS,0
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Aguacate",         R.drawable.ic_tablero_alimentos_verduras_aguacate       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Ajo",              R.drawable.ic_tablero_alimentos_verduras_ajos           ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Brócoli",          R.drawable.ic_tablero_alimentos_verduras_brocoli        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Calabaza",         R.drawable.ic_tablero_alimentos_verduras_calabaza       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Cebolla",          R.drawable.ic_tablero_alimentos_verduras_cebolla        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Coliflor",         R.drawable.ic_tablero_alimentos_verduras_coliflor       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Chicharos",        R.drawable.ic_tablero_alimentos_verduras_chicharos      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Chile",            R.drawable.ic_tablero_alimentos_verduras_chile          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Espinacas",        R.drawable.ic_tablero_alimentos_verduras_espinacas      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Hongos",           R.drawable.ic_tablero_alimentos_verduras_hongos         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Jitomate",         R.drawable.ic_tablero_alimentos_verduras_tomate         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Lechuga",          R.drawable.ic_tablero_alimentos_verduras_lechuga        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Maíz",             R.drawable.ic_tablero_alimentos_verduras_maiz           ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Papa",             R.drawable.ic_tablero_alimentos_verduras_patata         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Pepino",           R.drawable.ic_tablero_alimentos_verduras_pepino         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_VERDURAS,  "Zanahoria",        R.drawable.ic_tablero_alimentos_verduras_zanahoria      ,0,1,1,0));

        //============ COMIDA
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_COMIDA,  "Arroz",              R.drawable.ic_tablero_alimentos_comida_arroz        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_COMIDA,  "Carne",              R.drawable.ic_tablero_alimentos_comida_carne        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_COMIDA,  "Cereal",             R.drawable.ic_tablero_alimentos_comida_cereale      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_COMIDA,  "Huevo",              R.drawable.ic_tablero_alimentos_comida_huevo        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_COMIDA,  "Pan",                R.drawable.ic_tablero_alimentos_comida_pan          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_COMIDA,  "Pescado",            R.drawable.ic_tablero_alimentos_comida_pescado      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_COMIDA,  "Pollo",              R.drawable.ic_tablero_alimentos_comida_pollo        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_COMIDA,  "Sopa",               R.drawable.ic_tablero_alimentos_comida_sopa         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_COMIDA,  "Tortilla",           R.drawable.ic_tablero_alimentos_comida_tortilla     ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_COMIDA,  "Queso",              R.drawable.ic_tablero_alimentos_comida_queso        ,0,1,1,0));

        //============ POSTRES
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_POSTRES,  "Flan",              R.drawable.ic_tablero_alimentos_postres_flan        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_POSTRES,  "Helado",            R.drawable.ic_tablero_alimentos_postres_helado      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_POSTRES,  "Paleta",            R.drawable.ic_tablero_alimentos_postres_paleta      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_POSTRES,  "Palomitas",         R.drawable.ic_tablero_alimentos_postres_palomitas   ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_POSTRES,  "Pastel",            R.drawable.ic_tablero_alimentos_postres_pastel      ,0,1,1,0));

        //============ COMIDA GENERAL
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ALIMENTOS,  "Almuerzo",        R.drawable.ic_tablero_alimentos_comida_general_almuerzo     ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ALIMENTOS,  "Cena",            R.drawable.ic_tablero_alimentos_comida_general_cena         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ALIMENTOS,  "Comida",          R.drawable.ic_tablero_alimentos_comida_general_comida       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ALIMENTOS,  "Desayuno",        R.drawable.ic_tablero_alimentos_comida_general_desayuno     ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ALIMENTOS,  "Postre",          R.drawable.ic_tablero_alimentos_comida_general_postre       ,0,1,1,0));

        //============ ANIMALES
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Ardilla",          R.drawable.ic_tablero_animales_ardilla      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Boa",              R.drawable.ic_tablero_animales_serpiente    ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Ballena",          R.drawable.ic_tablero_animales_ballena      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Cocodrilo",        R.drawable.ic_tablero_animales_cocodrilo    ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Delfín",           R.drawable.ic_tablero_animales_delfin       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Elefante",         R.drawable.ic_tablero_animales_elefante     ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Flamenco",         R.drawable.ic_tablero_animales_flamenco     ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Gato",             R.drawable.ic_tablero_animales_gato         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Hiena",            R.drawable.ic_tablero_animales_hiena        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Iguana",           R.drawable.ic_tablero_animales_iguana       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Jirafa",           R.drawable.ic_tablero_animales_jirafa       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Koala",            R.drawable.ic_tablero_animales_koala        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "León",             R.drawable.ic_tablero_animales_leon         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Mono",             R.drawable.ic_tablero_animales_mono         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Nutria",           R.drawable.ic_tablero_animales_nutria       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Ñu",               R.drawable.ic_tablero_animales_nu           ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Oso",              R.drawable.ic_tablero_animales_oso          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Pez",              R.drawable.ic_tablero_animales_pez          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Quetzal",          R.drawable.ic_tablero_animales_quetzal      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Res",              R.drawable.ic_tablero_animales_res          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Sapo",             R.drawable.ic_tablero_animales_sapo         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Tortuga",          R.drawable.ic_tablero_animales_tortuga      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Urraca",           R.drawable.ic_tablero_animales_urraca       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Vaca",             R.drawable.ic_tablero_animales_vaca         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Wapití",           R.drawable.ic_tablero_animales_wapiti       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Yak",              R.drawable.ic_tablero_animales_yak          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMALES,  "Zorro",            R.drawable.ic_tablero_animales_zorro        ,0,1,1,0));

        //============ OBJETOS
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Calzón",            R.drawable.ic_tablero_objetos_calzon        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Cama",              R.drawable.ic_tablero_objetos_cama          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Camisa",            R.drawable.ic_tablero_objetos_camisa        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Carro",             R.drawable.ic_tablero_objetos_carro         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Celular",           R.drawable.ic_tablero_objetos_celular       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Chamarra",          R.drawable.ic_tablero_objetos_chamarra      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Computadora",       R.drawable.ic_tablero_objetos_computadora   ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Cuchara",           R.drawable.ic_tablero_objetos_cuchara       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Cuchillo",          R.drawable.ic_tablero_objetos_cuchillo      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Dulces",            R.drawable.ic_tablero_objetos_dulces        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Falda",             R.drawable.ic_tablero_objetos_falda         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Globos",            R.drawable.ic_tablero_objetos_globos        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Hoy",               R.drawable.ic_tablero_objetos_hoy           ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Jabón",             R.drawable.ic_tablero_objetos_jabon         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Juguete",           R.drawable.ic_tablero_objetos_juguete       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Lentes",            R.drawable.ic_tablero_objetos_lentes        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Luna",              R.drawable.ic_tablero_objetos_luna          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Luz",               R.drawable.ic_tablero_objetos_luz           ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Mesa",              R.drawable.ic_tablero_objetos_mesa          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Mochila",           R.drawable.ic_tablero_objetos_mochila       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Muñeca",            R.drawable.ic_tablero_objetos_muneca        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Música",            R.drawable.ic_tablero_objetos_musica        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Pantalones",        R.drawable.ic_tablero_objetos_pantalones    ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Paz",               R.drawable.ic_tablero_objetos_paz           ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Película",          R.drawable.ic_tablero_objetos_pelicula      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Peluche",           R.drawable.ic_tablero_objetos_peluche       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Pis",               R.drawable.ic_tablero_objetos_pis           ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Plato",             R.drawable.ic_tablero_objetos_plato         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Popo",              R.drawable.ic_tablero_objetos_popo          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Puerta",            R.drawable.ic_tablero_objetos_puerta        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Radio",             R.drawable.ic_tablero_objetos_radio         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Refrigerador",      R.drawable.ic_tablero_objetos_refrigerador  ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Silla",             R.drawable.ic_tablero_objetos_silla         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Sillón",            R.drawable.ic_tablero_objetos_sillon        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Sol",               R.drawable.ic_tablero_objetos_sol           ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Suéter",            R.drawable.ic_tablero_objetos_sueter        ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Televisión",        R.drawable.ic_tablero_objetos_television    ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Tenedor",           R.drawable.ic_tablero_objetos_tenedor       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Tenis",             R.drawable.ic_tablero_objetos_tenis         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_OBJETOS,  "Zapatos",           R.drawable.ic_tablero_objetos_zapatos       ,0,1,1,0));

        //============ ESTADOS DE ANIMO
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Aburrido",            R.drawable.ic_tablero_estados_animo_aburrido    ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Asustado",            R.drawable.ic_tablero_estados_animo_asustado    ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Cansado",             R.drawable.ic_tablero_estados_animo_cansado     ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Confundido",          R.drawable.ic_tablero_estados_animo_confundido  ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Enamorado",           R.drawable.ic_tablero_estados_animo_enamorado   ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Enfermo",             R.drawable.ic_tablero_estados_animo_enfermo     ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Enojado",             R.drawable.ic_tablero_estados_animo_enojado     ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Feliz",               R.drawable.ic_tablero_estados_animo_feliz       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Hambriento",          R.drawable.ic_tablero_estados_animo_hambriento  ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Pensativo",           R.drawable.ic_tablero_estados_animo_pensativo   ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Saludable",           R.drawable.ic_tablero_estados_animo_saludable   ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Somnoliento",         R.drawable.ic_tablero_estados_animo_somnoliento ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Sorprendido",         R.drawable.ic_tablero_estados_animo_sorprendido ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Triste",              R.drawable.ic_tablero_estados_animo_triste      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_ANIMO,  "Vergüenza",           R.drawable.ic_tablero_estados_animo_verguenza   ,0,1,1,0));


        //============ LUGARES
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_LUGARES,  "Casa",              R.drawable.ic_tablero_lugares_casa      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_LUGARES,  "Cine",              R.drawable.ic_tablero_lugares_cine      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_LUGARES,  "Escuela",           R.drawable.ic_tablero_lugares_escuela   ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_LUGARES,  "Hospital",          R.drawable.ic_tablero_lugares_hospital  ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_LUGARES,  "Iglesia",           R.drawable.ic_tablero_lugares_iglesia   ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_LUGARES,  "Mercado",           R.drawable.ic_tablero_lugares_mercado   ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_LUGARES,  "Museo",             R.drawable.ic_tablero_lugares_museo     ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_LUGARES,  "Parque",            R.drawable.ic_tablero_lugares_parque    ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_LUGARES,  "Tienda",            R.drawable.ic_tablero_lugares_tienda    ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_LUGARES,  "Zoológico",         R.drawable.ic_tablero_lugares_zoologico ,0,1,1,0));

        //============ FAMILIA
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FAMILIA,  "Abuelita",          R.drawable.ic_tablero_familia_abuelita      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FAMILIA,  "Abuelito",          R.drawable.ic_tablero_familia_abuelito      ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FAMILIA,  "Hermana",           R.drawable.ic_tablero_familia_hermana       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FAMILIA,  "Hermano",           R.drawable.ic_tablero_familia_hermano       ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FAMILIA,  "Mamá",              R.drawable.ic_tablero_familia_mama          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FAMILIA,  "Papá",              R.drawable.ic_tablero_familia_papa          ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FAMILIA,  "Prima",             R.drawable.ic_tablero_familia_prima         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FAMILIA,  "Primo",             R.drawable.ic_tablero_familia_primo         ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FAMILIA,  "Tía",               R.drawable.ic_tablero_familia_tia           ,0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(  TIPO_PIC_NORMAL, CAT_FAMILIA,  "Tío",               R.drawable.ic_tablero_familia_tio           ,0,1,1,0));
        //============ PROFESIONES
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES, "Astronauta",      R.drawable.ic_pic_profesiones_astronauta     , 0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES, "Capitán",         R.drawable.ic_pic_profesiones_capitan        , 0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES, "Detective",       R.drawable.ic_pic_profesiones_detective      , 0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES, "Doctor",          R.drawable.ic_pic_profesiones_doctor         , 0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES, "Enfermera",       R.drawable.ic_pic_profesiones_enfermera      , 0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES, "Granjero",        R.drawable.ic_pic_profesiones_granjero       , 0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES, "Ingeniero",       R.drawable.ic_pic_profesiones_ingeniero      , 0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES, "Maestra",         R.drawable.ic_pic_profesiones_maestra        , 0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES, "Mesera",          R.drawable.ic_pic_profesiones_mesera         , 0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES, "Piloto",          R.drawable.ic_pic_profesiones_piloto         , 0,1,1,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_PROFESIONES, "Soldado",         R.drawable.ic_pic_profesiones_soldado        , 0,1,1,0));


        System.out.println("Se cargaron todos los datos en la bd");

    }
    //</editor-fold>

    //<editor-fold desc="MÉTODO Init_Niveles SE ENVÍAN LOS DATOS A LA BASE DE DATOS">
    public void Init_Niveles(Context cn) {

        DBHelper dbHandler = new DBHelper(cn);

        dbHandler.agregarNivel(new Nivel(VISTA_NORMAL, "Vocales",        0,    R.drawable.ic_android_muestra));
        dbHandler.agregarNivel(new Nivel(VISTA_NORMAL, "Consonantes",    0,    R.drawable.ic_android_muestra));
        dbHandler.agregarNivel(new Nivel(VISTA_NORMAL, "Monosilabas",    0,    R.drawable.ic_android_muestra));
        dbHandler.agregarNivel(new Nivel(VISTA_NORMAL, "Bisilabas",      0,    R.drawable.ic_android_muestra));
        dbHandler.agregarNivel(new Nivel(VISTA_NORMAL, "Polisilabas",    0,    R.drawable.ic_android_muestra));

    }
    //</editor-fold>

    //<editor-fold desc="MÉTODO Init_Contenido_niveles() SE ENVIAN EL CONTENIDO DE ELEMENTOS DE CADA NIVEL A LA BASE DE DATOS">
    public void Init_Contenido_niveles(Context cn) {

        DBHelper dbHandler = new DBHelper(cn);
        System.out.println("*******************************************************************************");
        System.out.println("Init_Contenido_niveles");

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCALES, "Aa", 1, 0,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCALES, "Ee", 1, 0,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCALES, "Ii", 1, 0,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCALES, "Oo", 1, 0,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCALES, "Uu", 1, 0,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_A,  "A", 1, R.raw.a    ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_A, "Ae", 1, R.raw.ae   ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_A, "Ai", 1, R.raw.ai   ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_A, "Ao", 1, R.raw.ao   ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_A, "Au", 1, R.raw.au   ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_E, "E",  1, R.raw.e    ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_E, "Ea", 1, R.raw.ea    ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_E, "Ei", 1, R.raw.ei    ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_E, "Eo", 1, R.raw.eo    ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_E, "Eu", 1, R.raw.eu    ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_I, "I",  1, R.raw.i    ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_I, "Ia", 1, R.raw.ia    ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_I, "Ie", 1, R.raw.ie    ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_I, "Io", 1, R.raw.io    ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_I, "Iu", 1, R.raw.iu    ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_O,  "O", 1, R.raw.o    ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_O, "Oa", 1, R.raw.oa    ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_O, "Oe", 1, R.raw.oe    ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_O, "Oi", 1, R.raw.oi    ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_O, "Ou", 1, R.raw.ou    ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_U,  "U", 1, R.raw.u    ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_U, "Ua", 1, R.raw.ua    ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_U, "Ue", 1, R.raw.ue    ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_U, "Ui", 1, R.raw.ui    ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_VOCAL_U, "Uo", 1, R.raw.uo    ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Bb", 1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Cc", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Dd", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Ff", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Gg", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Hh", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Jj", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Kk", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Ll", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Mm", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Nn", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Pp", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Qq", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Rr", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Ss", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Tt", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Vv", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Ww", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Xx", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Yy", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES, "Zz", 1, R.raw.u ,0,0,0));


        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_B, "B",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_B, "Ba", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_B, "Be", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_B, "Bi", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_B, "Bo", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_B, "Bu", 1, R.raw.u ,0,0,0));


        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_C, "C",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_C, "Ca", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_C, "Ce", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_C, "Ci", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_C, "Co", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_C, "Cu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_D, "D",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_D, "Da", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_D, "De", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_D, "Di", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_D, "Do", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_D, "Du", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_F, "F",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_F, "Fa", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_F, "Fe", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_F, "Fi", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_F, "Fo", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_F, "Fu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_G, "G",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_G, "Ga", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_G, "Ge", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_G, "Gi", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_G, "Go", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_G, "Gu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_H, "H",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_H, "Ha", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_H, "He", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_H, "Hi", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_H, "Ho", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_H, "Hu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_J, "J",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_J, "Ja", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_J, "Je", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_J, "Ji", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_J, "Jo", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_J, "Ju", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_K, "K",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_K, "Ka", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_K, "Ke", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_K, "Ki", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_K, "Ko", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_K, "Ku", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_L, "L",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_L, "La", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_L, "Le", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_L, "Li", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_L, "Lo", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_L, "Lu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_M, "M",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_M, "Ma", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_M, "Me", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_M, "Mi", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_M, "Mo", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_M, "Mu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_N, "N",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_N, "Na", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_N, "Ne", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_N, "Ni", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_N, "No", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_N, "Nu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_P, "P",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_P, "Pa", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_P, "Pe", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_P, "Pi", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_P, "Po", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_P, "Pu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Q, "Q",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Q, "Qa", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Q, "Qe", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Q, "Qi", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Q, "Qo", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Q, "Qu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_R, "R",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_R, "Ra", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_R, "Re", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_R, "Ri", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_R, "Ro", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_R, "Ru", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_S, "S",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_S, "Sa", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_S, "Se", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_S, "Si", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_S, "So", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_S, "Su", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_T, "T",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_T, "Ta", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_T, "Te", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_T, "Ti", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_T, "To", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_T, "Tu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_V, "V",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_V, "Va", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_V, "Ve", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_V, "Vi", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_V, "Vo", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_V, "Vu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_W, "W",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_W, "Wa", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_W, "We", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_W, "Wi", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_W, "Wo", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_W, "Wu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_X, "X",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_X, "Xa", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_X, "Xe", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_X, "Xi", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_X, "Xo", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_X, "Xu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Y, "Y",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Y, "Ya", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Y, "Ye", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Y, "Yi", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Y, "Yo", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Y, "Yu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Z, "Z",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Z, "Za", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Z, "Ze", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Z, "Zi", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Z, "Zo", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_CONSONANTES_Z, "Zu", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS, "Animales",    1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS, "Bebidas",     1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS, "Comida",      1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS, "Familia",     1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS, "Objetos",     1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS, "Respuestas",  1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS, "Verbos",      1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_ANIMALES, "Pez",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_ANIMALES, "Res",  1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_ANIMALES, "Ñu",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_ANIMALES, "Yak",  1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_ANIMALES, "Boa",  1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_BEBIDAS, "Té",  1, R.raw.u ,1,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_COMIDA, "Pan",  1, R.raw.u ,1,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_FAMILIA, "Tío",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_FAMILIA, "Tía",  1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_OBJETOS, "Hoy",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_OBJETOS, "Luz",  1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_OBJETOS, "Paz",  1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_OBJETOS, "Pis",  1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_OBJETOS, "sol",  1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_RESPUESTAS, "Sí",   1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_RESPUESTAS, "No",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_RESPUESTAS, "Bien", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_RESPUESTAS, "Mal",  1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_VERBOS, "Ser",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_VERBOS, "Dar",  1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_VERBOS, "Ir",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_VERBOS, "Ver",  1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_MONOSILABAS_VERBOS, "Huir", 1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS, "Animales",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS, "Bebidas",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS, "Comida",    1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_ANIMALES, "Delfín",  1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_ANIMALES, "Gato",    1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_ANIMALES, "Hiena",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_ANIMALES, "Koala",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_ANIMALES, "León",    1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_ANIMALES, "Mono",    1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_ANIMALES, "Oso",     1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_ANIMALES, "Quetzal", 1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_ANIMALES, "Vaca",    1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_ANIMALES, "Zorro",   1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_BEBIDAS, "Jugo",     1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_BEBIDAS, "Leche",    1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_BEBIDAS, "Agua",     1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_COMIDA, "Arroz",   1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_COMIDA, "Carne",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_COMIDA, "Hiena",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_COMIDA, "Huevo",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_COMIDA, "Queso",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_COMIDA, "Pollo",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_BISILABAS_COMIDA, "Sopa",    1, R.raw.u ,0,0,0));


        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_POLISILABAS, "Bebidas",   1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_POLISILABAS, "Frutas",    1, R.raw.u ,0,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_POLISILABAS_BEBIDAS, "Refresco",   1, R.raw.u ,1,0,0));

        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_POLISILABAS_FRUTAS, "Cereza",    1, R.raw.u ,1,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_POLISILABAS_FRUTAS, "Sandía",    1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_POLISILABAS_FRUTAS, "Platano",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_POLISILABAS_FRUTAS, "Durazno",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_POLISILABAS_FRUTAS, "Naranja",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_POLISILABAS_FRUTAS, "Manzana",   1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_POLISILABAS_FRUTAS, "Papaya",    1, R.raw.u ,0,0,0));
        dbHandler.insertPictograma(new Pictograma(TIPO_PIC_NORMAL, CAT_POLISILABAS_FRUTAS, "Toronja",   1, R.raw.u ,0,0,0));

        System.out.println("Se cargaron todos los datos en la bd");
    }
    //</editor-fold>

}


