// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.4.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.profiles;

/**
 * 
 *         This is an activator which will detect an operating
 * system's attributes in order to activate
 *         its profile.
 *       
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class ActivationOS
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The name of the OS to be used to activate a profile.
     */
    private String name;

    /**
     * The general family of the OS to be used to activate a
     * profile (e.g. 'windows').
     */
    private String family;

    /**
     * The architecture of the OS to be used to activate a profile.
     */
    private String arch;

    /**
     * The version of the OS to be used to activate a profile.
     */
    private String version;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get the architecture of the OS to be used to activate a
     * profile.
     * 
     * @return String
     */
    public String getArch()
    {
        return this.arch;
    } //-- String getArch()

    /**
     * Get the general family of the OS to be used to activate a
     * profile (e.g. 'windows').
     * 
     * @return String
     */
    public String getFamily()
    {
        return this.family;
    } //-- String getFamily()

    /**
     * Get the name of the OS to be used to activate a profile.
     * 
     * @return String
     */
    public String getName()
    {
        return this.name;
    } //-- String getName()

    /**
     * Get the version of the OS to be used to activate a profile.
     * 
     * @return String
     */
    public String getVersion()
    {
        return this.version;
    } //-- String getVersion()

    /**
     * Set the architecture of the OS to be used to activate a
     * profile.
     * 
     * @param arch a arch object.
     */
    public void setArch( String arch )
    {
        this.arch = arch;
    } //-- void setArch( String )

    /**
     * Set the general family of the OS to be used to activate a
     * profile (e.g. 'windows').
     * 
     * @param family a family object.
     */
    public void setFamily( String family )
    {
        this.family = family;
    } //-- void setFamily( String )

    /**
     * Set the name of the OS to be used to activate a profile.
     * 
     * @param name a name object.
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Set the version of the OS to be used to activate a profile.
     * 
     * @param version a version object.
     */
    public void setVersion( String version )
    {
        this.version = version;
    } //-- void setVersion( String )

}
