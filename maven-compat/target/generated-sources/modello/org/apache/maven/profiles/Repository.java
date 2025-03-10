// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 2.4.0,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.profiles;

/**
 * 
 *         Repository contains the information needed for
 * establishing connections with remote repository
 *       .
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class Repository
    extends RepositoryBase
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * How to handle downloading of releases from this repository.
     */
    private RepositoryPolicy releases;

    /**
     * How to handle downloading of snapshots from this repository.
     */
    private RepositoryPolicy snapshots;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get how to handle downloading of releases from this
     * repository.
     * 
     * @return RepositoryPolicy
     */
    public RepositoryPolicy getReleases()
    {
        return this.releases;
    } //-- RepositoryPolicy getReleases()

    /**
     * Get how to handle downloading of snapshots from this
     * repository.
     * 
     * @return RepositoryPolicy
     */
    public RepositoryPolicy getSnapshots()
    {
        return this.snapshots;
    } //-- RepositoryPolicy getSnapshots()

    /**
     * Set how to handle downloading of releases from this
     * repository.
     * 
     * @param releases a releases object.
     */
    public void setReleases( RepositoryPolicy releases )
    {
        this.releases = releases;
    } //-- void setReleases( RepositoryPolicy )

    /**
     * Set how to handle downloading of snapshots from this
     * repository.
     * 
     * @param snapshots a snapshots object.
     */
    public void setSnapshots( RepositoryPolicy snapshots )
    {
        this.snapshots = snapshots;
    } //-- void setSnapshots( RepositoryPolicy )

    
            public boolean equals( Object obj )
            {
                return super.equals( obj );
            }
          
}
