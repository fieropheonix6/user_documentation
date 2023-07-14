/* 
 * Figshare API
 *
 * Figshare apiv2. Using Swagger 2.0
 *
 * OpenAPI spec version: 2.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

type FundingCreate struct {

	// A funding ID as returned by the Funding Search endpoint
	Id int64 `json:"id,omitempty"`

	// The title of the new user created funding
	Title string `json:"title,omitempty"`
}
