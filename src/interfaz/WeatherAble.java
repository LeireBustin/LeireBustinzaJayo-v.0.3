package interfaz;

public interface WeatherAble {

	

	public static final int UNIDAD_GRADOS_CELSIUS    = 0;

	public static final int UNIDAD_GRADOS_FHARENHEIT = 1;

	

	

	/**

	 * 

	 * @return String con nombre de la loacaliacion actual

	 */

	String getLocalizacion();

	

	/**

	 * Nos retorna la temperatura en grados celsius o fharenheit

	 * @param unidad para seleccionar que tipo de grados queremos

	 * @see UNIDAD_GRADOS_CELSIUS    = 0; 

	 *      UNIDAD_GRADOS_FHARENHEIT = 1;

	 * @return temperatura actual

	 */

	int getTemperatura( int unidad );

	

	/**

	 * Nombre del mes actual del sistema, por ejemplo: Agosto

	 * @return nombre del mes completo

	 */

	String getMes();

	

	/**

	 * Dia actual del mes, por ejemplo 31

	 * @return entero que representa el dia del mes

	 */

	int getDia();

	

	/**

	 * Caracter que representa el icono del tiempo

	 * @see: http://www.alessioatzeni.com/meteocons/

	 * @return letra icono

	 */

	char getIconoTiempo();



}