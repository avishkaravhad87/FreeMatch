// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.4.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.settings;

/**
 * Download policy.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class RepositoryPolicy
    implements java.io.Serializable, java.lang.Cloneable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * 
     *             Whether to use this repository for downloading
     * this type of
     *             artifact.
     *           
     */
    private boolean enabled = true;

    /**
     * 
     *             The frequency for downloading updates - can be
     * "always",
     *             "daily" (default), "interval:XXX" (in minutes)
     * or "never"
     *             (only if it doesn't exist locally).
     *           
     */
    private String updatePolicy;

    /**
     * 
     *             What to do when verification of an artifact
     * checksum fails -
     *             warn, fail, etc. Valid values are "fail" or
     * "warn".
     *           
     */
    private String checksumPolicy;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     * 
     * @return RepositoryPolicy
     */
    public RepositoryPolicy clone()
    {
        try
        {
            RepositoryPolicy copy = (RepositoryPolicy) super.clone();

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- RepositoryPolicy clone()

    /**
     * Get what to do when verification of an artifact checksum
     * fails -
     *             warn, fail, etc. Valid values are "fail" or
     * "warn".
     * 
     * @return String
     */
    public String getChecksumPolicy()
    {
        return this.checksumPolicy;
    } //-- String getChecksumPolicy()

    /**
     * Get the frequency for downloading updates - can be "always",
     *             "daily" (default), "interval:XXX" (in minutes)
     * or "never"
     *             (only if it doesn't exist locally).
     * 
     * @return String
     */
    public String getUpdatePolicy()
    {
        return this.updatePolicy;
    } //-- String getUpdatePolicy()

    /**
     * Get whether to use this repository for downloading this type
     * of
     *             artifact.
     * 
     * @return boolean
     */
    public boolean isEnabled()
    {
        return this.enabled;
    } //-- boolean isEnabled()

    /**
     * Set what to do when verification of an artifact checksum
     * fails -
     *             warn, fail, etc. Valid values are "fail" or
     * "warn".
     * 
     * @param checksumPolicy a checksumPolicy object.
     */
    public void setChecksumPolicy( String checksumPolicy )
    {
        this.checksumPolicy = checksumPolicy;
    } //-- void setChecksumPolicy( String )

    /**
     * Set whether to use this repository for downloading this type
     * of
     *             artifact.
     * 
     * @param enabled a enabled object.
     */
    public void setEnabled( boolean enabled )
    {
        this.enabled = enabled;
    } //-- void setEnabled( boolean )

    /**
     * Set the frequency for downloading updates - can be "always",
     *             "daily" (default), "interval:XXX" (in minutes)
     * or "never"
     *             (only if it doesn't exist locally).
     * 
     * @param updatePolicy a updatePolicy object.
     */
    public void setUpdatePolicy( String updatePolicy )
    {
        this.updatePolicy = updatePolicy;
    } //-- void setUpdatePolicy( String )

}
