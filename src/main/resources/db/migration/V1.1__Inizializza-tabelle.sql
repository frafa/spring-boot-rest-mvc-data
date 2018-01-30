USE [Test];

-- Add a new column 'AuthenticationMode' to table 'Users' in schema 'dbo'
IF NOT EXISTS (SELECT * FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = 'Users' and COLUMN_NAME = 'AuthenticationMode')
--IF OBJECT_ID('dbo.Users', 'U') IS NOT NULL
ALTER TABLE dbo.Users
    ADD AuthenticationMode [NVARCHAR](1) NULL
GO
