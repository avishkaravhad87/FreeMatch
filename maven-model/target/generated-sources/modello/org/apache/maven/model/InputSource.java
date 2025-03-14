// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.4.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model;

/**
 * Class InputSource.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class InputSource
    implements java.io.Serializable, java.lang.Cloneable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * 
     *             
     *             The identifier of the POM in the format {@code
     * <groupId>:<artifactId>:<version>}.
     *             
     *           
     */
    private String modelId;

    /**
     * 
     *             
     *             The path/URL of the POM or {@code null} if
     * unknown.
     *             
     *           
     */
    private String location;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     * 
     * @return InputSource
     */
    public InputSource clone()
    {
        try
        {
            InputSource copy = (InputSource) super.clone();

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- InputSource clone()

    /**
     * Get the path/URL of the POM or {@code null} if unknown.
     * 
     * @return String
     */
    public String getLocation()
    {
        return this.location;
    } //-- String getLocation()

    /**
     * Get the identifier of the POM in the format {@code
     * <groupId>:<artifactId>:<version>}.
     * 
     * @return String
     */
    public String getModelId()
    {
        return this.modelId;
    } //-- String getModelId()

    /**
     * Set the path/URL of the POM or {@code null} if unknown.
     * 
     * @param location a location object.
     */
    public void setLocation( String location )
    {
        this.location = location;
    } //-- void setLocation( String )

    /**
     * Set the identifier of the POM in the format {@code
     * <groupId>:<artifactId>:<version>}.
     * 
     * @param modelId a modelId object.
     */
    public void setModelId( String modelId )
    {
        this.modelId = modelId;
    } //-- void setModelId( String )

    
            
    @Override
    public String toString()
    {
        return getModelId() + " " + getLocation();
    }
            
          
}
