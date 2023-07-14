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

type UploadFilePart struct {

	// File part id
	PartNo int64 `json:"partNo,omitempty"`

	// Indexes on byte range. zero-based and inclusive
	StartOffset int64 `json:"startOffset,omitempty"`

	// Indexes on byte range. zero-based and inclusive
	EndOffset int64 `json:"endOffset,omitempty"`

	// part status
	Status string `json:"status,omitempty"`

	// When a part is being uploaded it is being locked, by setting the locked flag to true. No changes/uploads can happen on this part from other requests.
	Locked bool `json:"locked,omitempty"`
}
