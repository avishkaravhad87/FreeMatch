// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.4.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model;

/**
 * Represents a set of reports and configuration to be used to
 * generate them.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class ReportSet
    extends ConfigurationContainer
    implements java.io.Serializable, java.lang.Cloneable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The unique id for this report set, to be used during POM
     * inheritance and profile injection
     *             for merging of report sets.
     *           
     */
    private String id = "default";

    /**
     * Field reports.
     */
    private java.util.List<String> reports;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addReport.
     * 
     * @param string a string object.
     */
    public void addReport( String string )
    {
        getReports().add( string );
    } //-- void addReport( String )

    /**
     * Method clone.
     * 
     * @return ReportSet
     */
    public ReportSet clone()
    {
        try
        {
            ReportSet copy = (ReportSet) super.clone();

            if ( this.reports != null )
            {
                copy.reports = new java.util.ArrayList<String>();
                copy.reports.addAll( this.reports );
            }

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- ReportSet clone()

    /**
     * Get the unique id for this report set, to be used during POM
     * inheritance and profile injection
     *             for merging of report sets.
     * 
     * @return String
     */
    public String getId()
    {
        return this.id;
    } //-- String getId()

    /**
     * Method getReports.
     * 
     * @return List
     */
    public java.util.List<String> getReports()
    {
        if ( this.reports == null )
        {
            this.reports = new java.util.ArrayList<String>();
        }

        return this.reports;
    } //-- java.util.List<String> getReports()

    /**
     * Method removeReport.
     * 
     * @param string a string object.
     */
    public void removeReport( String string )
    {
        getReports().remove( string );
    } //-- void removeReport( String )

    /**
     * Set the unique id for this report set, to be used during POM
     * inheritance and profile injection
     *             for merging of report sets.
     * 
     * @param id a id object.
     */
    public void setId( String id )
    {
        this.id = id;
    } //-- void setId( String )

    /**
     * Set the list of reports from this plugin which should be
     * generated from this set.
     * 
     * @param reports a reports object.
     */
    public void setReports( java.util.List<String> reports )
    {
        this.reports = reports;
    } //-- void setReports( java.util.List )

    
            
    @Override
    public String toString()
    {
        return getId();
    }
            
          
}
