// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.4.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.profiles;

/**
 * 
 *         The conditions within the build runtime environment
 * which will trigger
 *         the automatic inclusion of the parent build profile.
 *       
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Activation
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Flag specifying whether this profile is active as a default.
     */
    private boolean activeByDefault = false;

    /**
     * 
     *             Specifies that this profile will be activated
     * when a matching JDK is detected.
     *           
     */
    private String jdk;

    /**
     * 
     *             Specifies that this profile will be activated
     * when matching OS attributes are detected.
     *           
     */
    private ActivationOS os;

    /**
     * 
     *             Specifies that this profile will be activated
     * when this property is specified.
     *           
     */
    private ActivationProperty property;

    /**
     * 
     *              Specifies that this profile will be activated
     * based on existence of a file.
     *              
     */
    private ActivationFile file;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get specifies that this profile will be activated based on
     * existence of a file.
     * 
     * @return ActivationFile
     */
    public ActivationFile getFile()
    {
        return this.file;
    } //-- ActivationFile getFile()

    /**
     * Get specifies that this profile will be activated when a
     * matching JDK is detected.
     * 
     * @return String
     */
    public String getJdk()
    {
        return this.jdk;
    } //-- String getJdk()

    /**
     * Get specifies that this profile will be activated when
     * matching OS attributes are detected.
     * 
     * @return ActivationOS
     */
    public ActivationOS getOs()
    {
        return this.os;
    } //-- ActivationOS getOs()

    /**
     * Get specifies that this profile will be activated when this
     * property is specified.
     * 
     * @return ActivationProperty
     */
    public ActivationProperty getProperty()
    {
        return this.property;
    } //-- ActivationProperty getProperty()

    /**
     * Get flag specifying whether this profile is active as a
     * default.
     * 
     * @return boolean
     */
    public boolean isActiveByDefault()
    {
        return this.activeByDefault;
    } //-- boolean isActiveByDefault()

    /**
     * Set flag specifying whether this profile is active as a
     * default.
     * 
     * @param activeByDefault a activeByDefault object.
     */
    public void setActiveByDefault( boolean activeByDefault )
    {
        this.activeByDefault = activeByDefault;
    } //-- void setActiveByDefault( boolean )

    /**
     * Set specifies that this profile will be activated based on
     * existence of a file.
     * 
     * @param file a file object.
     */
    public void setFile( ActivationFile file )
    {
        this.file = file;
    } //-- void setFile( ActivationFile )

    /**
     * Set specifies that this profile will be activated when a
     * matching JDK is detected.
     * 
     * @param jdk a jdk object.
     */
    public void setJdk( String jdk )
    {
        this.jdk = jdk;
    } //-- void setJdk( String )

    /**
     * Set specifies that this profile will be activated when
     * matching OS attributes are detected.
     * 
     * @param os a os object.
     */
    public void setOs( ActivationOS os )
    {
        this.os = os;
    } //-- void setOs( ActivationOS )

    /**
     * Set specifies that this profile will be activated when this
     * property is specified.
     * 
     * @param property a property object.
     */
    public void setProperty( ActivationProperty property )
    {
        this.property = property;
    } //-- void setProperty( ActivationProperty )

}
