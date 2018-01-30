USE [Test];

-- Create a new table called 'Users' in schema 'dbo'
-- Drop the table if it already exists
IF OBJECT_ID('dbo.Users', 'U') IS NOT NULL
DROP TABLE dbo.Users
GO

-- Create the table in the specified schema
CREATE TABLE dbo.Users
(
    Id INT NOT NULL IDENTITY(1,1) PRIMARY KEY, -- primary key column
    UserName [NVARCHAR](255) NOT NULL,
    Password [NVARCHAR](16) NOT NULL
);
GO