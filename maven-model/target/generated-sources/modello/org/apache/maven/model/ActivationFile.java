// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.4.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model;

/**
 * This is the file specification used to activate the profile. The
 * <code>missing</code> value
 *         is the location of a file that needs to exist, and if it
 * doesn't, the profile will be
 *         activated. On the other hand, <code>exists</code> will
 * test for the existence of the file and if it is
 *         there, the profile will be activated.<br>
 *         Variable interpolation for these file specifications is
 * limited to <code>${project.basedir}</code>,
 *         system properties and user properties.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class ActivationFile
    implements java.io.Serializable, java.lang.Cloneable, org.apache.maven.model.InputLocationTracker
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The name of the file that must be missing to activate the
     *           profile.
     */
    private String missing;

    /**
     * The name of the file that must exist to activate the profile.
     */
    private String exists;

    /**
     * Field locations.
     */
    private java.util.Map<Object, InputLocation> locations;

    /**
     * Field location.
     */
    private InputLocation location;

    /**
     * Field missingLocation.
     */
    private InputLocation missingLocation;

    /**
     * Field existsLocation.
     */
    private InputLocation existsLocation;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     * 
     * @return ActivationFile
     */
    public ActivationFile clone()
    {
        try
        {
            ActivationFile copy = (ActivationFile) super.clone();

            if ( copy.locations != null )
            {
                copy.locations = new java.util.LinkedHashMap( copy.locations );
            }

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- ActivationFile clone()

    /**
     * Get the name of the file that must exist to activate the
     * profile.
     * 
     * @return String
     */
    public String getExists()
    {
        return this.exists;
    } //-- String getExists()

    /**
     * 
     * 
     * @param key a key object.
     * @return InputLocation
     */
    public InputLocation getLocation( Object key )
    {
        if ( key instanceof String )
        {
            switch ( ( String ) key )
            {
                case "" :
                {
                    return this.location;
                }
                case "missing" :
                {
                    return missingLocation;
                }
                case "exists" :
                {
                    return existsLocation;
                }
                default :
                {
                    return getOtherLocation( key );
                }
                }
            }
            else
            {
                return getOtherLocation( key );
            }
    } //-- InputLocation getLocation( Object )

    /**
     * Get the name of the file that must be missing to activate
     * the
     *           profile.
     * 
     * @return String
     */
    public String getMissing()
    {
        return this.missing;
    } //-- String getMissing()

    /**
     * 
     * 
     * @param key a key object.
     * @param location a location object.
     */
    public void setLocation( Object key, InputLocation location )
    {
        if ( key instanceof String )
        {
            switch ( ( String ) key )
            {
                case "" :
                {
                    this.location = location;
                    return;
                }
                case "missing" :
                {
                    missingLocation = location;
                    return;
                }
                case "exists" :
                {
                    existsLocation = location;
                    return;
                }
                default :
                {
                    setOtherLocation( key, location );
                    return;
                }
            }
        }
        else
        {
            setOtherLocation( key, location );
        }
    } //-- void setLocation( Object, InputLocation )

    /**
     * 
     * 
     * @param key a key object.
     * @param location a location object.
     */
    public void setOtherLocation( Object key, InputLocation location )
    {
        if ( location != null )
        {
            if ( this.locations == null )
            {
                this.locations = new java.util.LinkedHashMap<Object, InputLocation>();
            }
            this.locations.put( key, location );
        }
    } //-- void setOtherLocation( Object, InputLocation )

    /**
     * 
     * 
     * @param key a key object.
     * @return InputLocation
     */
    private InputLocation getOtherLocation( Object key )
    {
        return ( locations != null ) ? locations.get( key ) : null;
    } //-- InputLocation getOtherLocation( Object )

    /**
     * Set the name of the file that must exist to activate the
     * profile.
     * 
     * @param exists a exists object.
     */
    public void setExists( String exists )
    {
        this.exists = exists;
    } //-- void setExists( String )

    /**
     * Set the name of the file that must be missing to activate
     * the
     *           profile.
     * 
     * @param missing a missing object.
     */
    public void setMissing( String missing )
    {
        this.missing = missing;
    } //-- void setMissing( String )

}
